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
	<h1>목록페이지</h1>
	<a href="/board/enroll">게시판 등록</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>닉네임</th>
				<th>제목</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="con">
				<tr>
					<td><c:out value="${con.nickname }" /></td>
					<td><c:out value="${con.title }" /></td>
					<td><c:out value="${con.content }" /></td>
					
				</tr>
			</c:forEach>		
		</tbody>
	</table>
	
</body>
</html>