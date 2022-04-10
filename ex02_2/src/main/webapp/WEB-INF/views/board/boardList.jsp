<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2 {
		text-align: center;
	}
	table {
		width: 100%;
	}
	#outter {
		display: block;
		width: 60%;
		margin: auto;
	}
</style>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작가</th>
				<th>날짜</th>
				<th>CNT</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${viewAll}" var="list">
			<tr>
				<td>${list.seq }</td>
				<td><a href='/detail?seq=${list.seq }'>${list.title }</a></td>
				<td>${list.writer }</td>
				<td><fmt:formatDate value="${list.regdate }" pattern="yyyy.MM.dd" /></td>
				<td>${list.cnt }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>