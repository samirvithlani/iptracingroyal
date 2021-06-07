<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function searchData(data) {

		var xmlhttp = new XMLHttpRequest();

		xmlhttp.onreadystatechange = function() {

			document.getElementById("res").innerHTML = xmlhttp.responseText;

		}
		//async non async
		//
		//
		xmlhttp.open("POST", "displayData.jsp?q=" + data, true);
		xmlhttp.send();
	}
</script>
</head>
<body>
	<input type="text" id="search" onkeyup="searchData(this.value)">
	<div id="res"></div>
</body>
</html>