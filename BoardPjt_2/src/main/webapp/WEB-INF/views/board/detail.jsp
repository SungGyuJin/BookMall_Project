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
<h1>상세페이지</h1>
<table border="1" style="text-align: center;">
	<tr>
		<td>게시글 번호</td>
		<td><input name="bno" readonly="readonly" value='<c:out value="${detail.bno}"/>' ></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input name="title" readonly="readonly" value='<c:out value="${detail.title}"/>' ></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea name="content" rows="5" readonly="readonly"><c:out value="${detail.content}"/></textarea>
		</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input name="writer" readonly="readonly" value='<c:out value="${detail.writer}"/>' ></td>
	</tr>
	<tr>
		<td>등록일</td>
		<td><input name="regdate" readonly="readonly" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${detail.regdate }"/>' /></td>
	</tr>
	<tr>
		<td>수정일</td>
		<td><input name="updatedate" readonly="readonly" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${detail.updatedate }"/>' /></td>
	</tr>
</table>
<br>
<a href="/board/list">리스트</a>&nbsp;
<a href="/board/modify?bno=${detail.bno}">수정하기</a>
</body>
</html>