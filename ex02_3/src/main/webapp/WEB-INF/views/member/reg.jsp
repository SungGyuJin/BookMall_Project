<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>등록페이지</h2>
	<hr>
	
	<form>
		<table border="1" style="text-align: center;">
			<tr>
				<td>번호</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="등록"/></td>
			</tr>
		</table>
	</form>
</body>
</html>