<%@page import="com.bean.Replace"%>
<%@ taglib uri="/WEB-INF/ElDemo.tld" prefix="elf"%>
<%@ taglib uri="/WEB-INF/ctag.tld" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- 	<%
	Replace r = new Replace();
	int len = r.len("samir");
	out.println(len);
	%> --%>
	${elf:len(10) } ${elf:toUpper("samir") }
	<c:detail />

</body>
</html>