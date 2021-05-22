<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>PRODUCT ID</th>
			<th>PRODUCT NAME</th>
			<th>PRODUCT DETAIL</th>
			<th>PRODUCT IMAGE</th>
		</tr>
		<%
		List<ProductBean> productList = (ArrayList<ProductBean>) request.getAttribute("phoneList");
		for (int i = 0; i < productList.size(); i++) {

			ProductBean productBean = productList.get(i);
		%>
		<tr>
			<td><%=productBean.getpId()%></td>
			<td><%=productBean.getpName()%></td>
			<td><%=productBean.getpDetail()%></td>
			<td>​<picture> <img
					src="upload/<%=productBean.getpImageURL()%>"
					class="img-fluid img-thumbnail"></picture>
			</td>
			<%-- <td><img src="upload/<%=productBean.getpImageURL()%>"></td> --%>

		</tr>


		<%
		}
		%>

	</table>
</body>
</html>