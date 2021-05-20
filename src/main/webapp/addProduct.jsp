<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProductController" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>ENTER PRoduct NAME</td>
				<td><input type="text" name="txtProductName"></td>
			</tr>
			<tr>
				<td>ENTER PRoduct Detail</td>
				<td><input type="text" name="txtProductDetail"></td>
			</tr>
			<tr>
				<td><input type="file" name="image"></td>
			</tr>
			<tr>

				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>

	</form>

</body>
</html>