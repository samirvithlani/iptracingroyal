<%@page import="javax.net.ssl.SNIHostName"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%
		String name = request.getParameter("q");
		%>
	</h1>

	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/7pm", "root", "root");
	if (conn != null) {

		if (!name.equals("")) {
			PreparedStatement pstmt = conn.prepareStatement("select * from student where sname like '" + name + "%'");
			//pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
	%>

	<ul>
		<li><a href="#"> <%
 out.println(rs.getString("sname"));
 %>
		</a></li>
	</ul>

	<%
	}
	}

	}
	%>
</body>
</html>