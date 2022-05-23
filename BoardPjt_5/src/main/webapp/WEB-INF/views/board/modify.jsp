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
<h2>수정/삭제페이지</h2>

<form id="postForm" action="/board/modify" method="post">
	<div class="input_info">
		<label>번호</label>
		<input name="bno" readonly="readonly" value="<c:out value='${pageInfo.bno}' />" />
	</div>
	<div class="input_info">
		<label>제목</label>
		<input id="title" name="title" value="<c:out value='${pageInfo.title}' />" />
	</div>
	<div class="input_info">
		<label>내용</label>
		<textarea rows="5" id="content" name="content"><c:out value="${pageInfo.content}" /></textarea>
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
		<a class="btn" id="btn_modify">수정완료</a>
		<a class="btn" id="btn_delete">삭제</a>
		<a class="btn" id="btn_list">목록페이지</a>
	</div>
</form>
	
	<form id="modifyFm" action="/board/modify" method="get">
		<input type="hidden" id="bno" name="bno" value="<c:out value='${pageInfo.bno}'/>" />
	</form>

<script>
	
	let postFm = $("#postForm");
	let mFm = $("#modifyFm");

	// 수정완료
	$("#btn_modify").on("click", function(e){
		alert("수정완료!!");
		postFm.submit();
	});

	// 삭제
	$("#btn_delete").on("click", function(e){
		mFm.attr("action", "/board/delete");
		mFm.attr("method", "post");
		alert("삭제완료!!");
		mFm.submit();
	});
	
	// 목록페이지
	$("#btn_list").on("click", function(e){
		mFm.find("#bno").remove();
		mFm.attr("action", "/board/list");
		mFm.submit();
	});
</script>
</body>
</html>