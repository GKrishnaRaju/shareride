<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Spring boot</title>
</head>
<body>
	<h1>Spring boot-web Application Example</h1>
	<hr>
	<div class="form">
	<form  name="loginform" action="hello" method="post" onsubmit="return validate()">
	<table>
		<tr>
		<td>Enter your name</td>
		<td><input id="name" name="name"></td>
		<td><input type="submit" value="submit"></td>
		</tr>
	</table>
	</form>
	</div>
</body>
</html>