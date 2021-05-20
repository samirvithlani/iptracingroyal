package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class AddProductController
 */
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items = null;
		String fieldName = null;
		String fieldValue = null;
		String filName = null;

		try {
			//request  as a list  ->
			items = upload.parseRequest(request); // txtProductname,detail,file
			for (int i = 0; i < items.size(); i++) {

				
				FileItem item = items.get(i);

				//
				if (item.isFormField()) {

					// 0 -->
					fieldName = item.getFieldName();
					fieldValue = item.getString();

					if (fieldName.equalsIgnoreCase("txtProductName")) {

						String value = fieldValue;
						System.out.println(value);
						// set in productBean productBean.setPname(value)
					}
					if (fieldName.equalsIgnoreCase("txtProductDetail")) {

						String value = fieldValue;
						System.out.println(value);
						// set in productBean productBean.setPDetail(value)

					}

				} //
				else {

					fieldName = item.getFieldName(); // image
					System.out.println("fieldName =" + fieldName);
					filName = item.getName();
					System.out.println("fileName =" + filName);

					// path : c:abcd:xyz //// filename

					filName = filName.substring(filName.lastIndexOf("\\") + 1, filName.length());
					//productBean.setImagepath()
					System.out.println("filename 1" + filName);

					ServletContext context = getServletContext();

					String path = "E:\\samir\\eclipse workspaces_legion\\advance java_jsp_servlet\\IpTracing\\upload";
					// project
//					String abspath = getServletContext().getRealPath(path);
					//System.out.println("abs path" + abspath);

					File file = new File(path + File.separator + filName);

					try {

						//FileItem
						item.write(file);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		doGet(request, response);
	}

}
