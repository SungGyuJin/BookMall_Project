<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>등록</h1>

<form action="/board/reg" method="post">
<table border="1">
	<tr>
		<td>제목</td>
		<td><input id="title" name="title" /></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="5" id="content" name="content"></textarea></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input id="writer" name="writer" /></td>
	</tr>
</table>
	<button>등록</button>
</form>
<a href="/board/list">리스트</a>
</body>
</html>