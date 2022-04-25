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
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>글쓴이</th>
				<th>등록날짜</th>
				<th>수정날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="con">
				<tr>
					<td><c:out value="${con.bno }" /></td>
					<td><c:out value="${con.title }" /></td>
					<td><c:out value="${con.content }" /></td>
					<td><c:out value="${con.writer }" /></td>
					<td><fmt:formatDate pattern="yyyy/MM/dd" value="${con.regdate }" /></td>
					<td><fmt:formatDate pattern="yyyy/MM/dd" value="${con.updatedate }" /></td>
				</tr>
			</c:forEach>		
		</tbody>
	</table>
	
</body>
</html>