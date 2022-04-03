<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>조회페이지</h2>
	<hr>
	
	<table border="1" style="text-align: center;">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>비밀번호</th>
			</tr>
		</thead>
		<c:forEach items="${viewList }" var="name">
			<tr>
				<td><c:out value="${name.id }" /></td>
				<td><c:out value="${name.name }" /></td>
				<td><c:out value="${name.password }" /></td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>