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
<h3>상세페이지</h3>
<div class="input_text">
	<label>번호</label>
	<input id="bno" name="bno" readonly="readonly" value="${detailList.bno}" />
</div>
<div class="input_text">
	<label>제목</label>
	<input id="title" name="title" readonly="readonly" value="${detailList.title}" />
</div>
<div class="input_text">
	<label>내용</label>
	<textarea rows="5" id="content" name="content" readonly="readonly"><c:out value="${detailList.content}" /></textarea>
</div>
<div class="input_text">
	<label>작성자</label>
	<input id="writer" name="writer" readonly="readonly" value="${detailList.writer}" />
</div>
<div class="input_text">
	<label>작성일</label>
	<input id="regdate" name="regdate" readonly="readonly" value="${detailList.regdate}" />
</div>
<div class="input_text">
	<label>수정일</label>
	<input id="updatedate" name="updatedate" readonly="readonly" value="${detailList.updatedate}" />
</div>
<a href="/board/modifyPage?bno=${detailList.bno}">수정하기</a>
</body>
</html>