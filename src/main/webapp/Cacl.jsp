<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CALC</title>
</head>
<body>

	<%
	try {
		int a = 10, b = 0;
		int c = a / b;
		out.print(c);
	} catch (Exception e) {

		//out.println("inside catch....");
		//response.sendRedirect("error.jsp");
		//request.setAttribute("exception", e);
		//request.getRequestDispatcher("error.jsp").forward(request, response);
		throw new Exception("invalid....",e);
	}
	%>
</body>
</html>