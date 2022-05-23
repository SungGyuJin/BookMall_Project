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
<h2>목록페이지</h2>
<table border="1">
	<thead>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>수정일</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listPage}" var="list">
			<tr>
				<td><c:out value="${list.bno}" /></td>
				<td><a href="/board/detail?bno=${list.bno}"><c:out value="${list.title}" /></a></td>
				<td><c:out value="${list.writer}" /></td>
				<td><fmt:formatDate value="${list.regdate}" pattern="yyyy-MM-dd" /></td>
				<td><fmt:formatDate value="${list.updatedate}" pattern="yyyy-MM-dd" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>