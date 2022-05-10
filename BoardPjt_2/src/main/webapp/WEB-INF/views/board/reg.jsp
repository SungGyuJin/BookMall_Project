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
	제목: <input id="title" name="title" /> <br>
	내용: <input id="content" name="content" /> <br>
	작성자: <input id="writer" name="writer" /> <br>
	<button>등록</button>
</form>
</body>
</html>