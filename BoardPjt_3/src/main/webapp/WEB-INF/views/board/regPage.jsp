<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>등록페이지</h3>
<form action="/board/regPage" method="post">
<table border="1" style="text-align: center;">
	<tr>
		<td><label>제목</label></td>
		<td><input id="title" name="title"></td>
	</tr>
	<tr>
		<td><label>내용</label></td>
		<td><textarea id="content" name="content" rows="5"></textarea></td>
	</tr>
	<tr>
		<td><label>작성자</label></td>
		<td><input id="writer" name="writer"></td>
	</tr>
</table>
<button>등록</button>
</form>
</body>
</html>