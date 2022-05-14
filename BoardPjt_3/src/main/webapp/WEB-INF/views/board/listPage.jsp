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
<h3>목록페이지</h3>
<table border="1" style="text-align: center;">
	<thead>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>수정일</td>
		</tr>
	</thead>
	<c:forEach items="${boardList}" var="list">
		<tr>
			<td><c:out value='${list.bno}' /></td>
			<td><c:out value='${list.title}' /></td>
			<td><c:out value='${list.content}' /></td>
			<td><c:out value='${list.writer}' /></td>
			<td><fmt:formatDate value='${list.regdate}' pattern="yyyy-MM-dd"/></td>
			<td><fmt:formatDate value='${list.updatedate}' pattern="yyyy-MM-dd"/></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>