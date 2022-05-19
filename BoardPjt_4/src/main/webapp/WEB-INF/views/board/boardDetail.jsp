<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.btn{
		cursor: pointer;
	}
</style>
</head>
<body>
<h2>상세페이지</h2>
<div class="input wer">
	<div class="inputField">
		<label>번호</label>
		<input name="bno" readonly="readonly" value="<c:out value='${detailPage.bno}' />"/>
	</div>
	<div class="inputField">
		<label>제목</label>
		<input name="title" readonly="readonly" value="<c:out value='${detailPage.title}' />"/>
	</div>
	<div class="inputField">
		<label>내용</label>
		<textarea name="content" rows="5" readonly="readonly" ><c:out value="${detailPage.content}" /></textarea>
	</div>
	<div class="inputField">
		<label>작성자</label>
		<input name="writer" readonly="readonly" value="<c:out value='${detailPage.writer}' />"/>
	</div>
	<div class="inputField">
		<label>등록일</label>
		<input name="regdate" readonly="readonly" value="<fmt:formatDate pattern="yyyy-MM-dd" value='${detailPage.regdate}'/>" />
	</div>
	<div class="inputField">
		<label>수정일</label>
		<input name="updatedate" readonly="readonly" value="<fmt:formatDate pattern="yyyy-MM-dd" value='${detailPage.updatedate}'/>" />
	</div>
	<div class="inputField">
		<a href="/board/boardUpdate?bno=${detailPage.bno}">수정하기</a>
		<a class="btn" id="btn_list">목록페이지</a>
	</div>
</div>
	<form id="moveForm">
		<input type="hidden" id="bno" name="bno" value="<c:out value='${detailPage.bno}' />" />
	</form>
<script>
	
	
</script>
</body>
</html>