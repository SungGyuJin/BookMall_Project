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
<h2>상세페이지</h2>

	<div class="input_info">
		<label>번호</label>
		<input name="bno" readonly="readonly" value="<c:out value='${pageInfo.bno}' />" />
	</div>
	<div class="input_info">
		<label>제목</label>
		<input id="title" name="title" readonly="readonly" value="<c:out value='${pageInfo.title}' />" />
	</div>
	<div class="input_info">
		<label>내용</label>
		<textarea rows="5" id="content" name="content" readonly="readonly"><c:out value="${pageInfo.content}" /></textarea>
	</div>
	<div class="input_info">
		<label>작성자</label>
		<input id="writer" name="writer" readonly="readonly" value="<c:out value='${pageInfo.writer}' />" />
	</div>
	<div class="input_info">
		<label>등록일</label>
		<input id="regdate" name="regdate" readonly="readonly" value="<fmt:formatDate value='${pageInfo.regdate}' pattern="yyyy-MM-dd" />" />
	</div>
	<div class="input_info">
		<label>수정일</label>
		<input id="updatedate" name="updatedate" readonly="readonly" value="<fmt:formatDate value='${pageInfo.updatedate}' pattern="yyyy-MM-dd" />" />
	</div>
	<div class="input_info">
		<a class="btn" id="btn_modify">수정/삭제하기</a>
		<a class="btn" id="btn_list">목록페이지</a>
	</div>
	
	<form id="detailFm" method="get">
		<input type="hidden" id="bno" name="bno" value="<c:out value='${pageInfo.bno}'/>" />
	</form>

<script>
	
	let deFm = $("#detailFm");

	$("#btn_modify").on("click", function(e){
		
		deFm.attr("action", "/board/modify");
		deFm.submit();
	});

	$("#btn_list").on("click", function(e){
		
		deFm.find("#bno").remove();
		deFm.attr("action", "/board/list");
		deFm.submit();
	});
</script>
</body>
</html>