<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.btn_wrap{
	padding-left : 80px;
	margin-top : 50px;
}


.btn{
  	display: inline-block;
    font-size: 22px;
    padding: 6px 12px;
    background-color: #fff;
    border: 1px solid #ddd;
    font-weight: 600;
    width: 140px;
    height: 41px;
    line-height: 39px;
    text-align : center;
    margin-left : 30px;
    cursor : pointer;
}
</style>
</head>
<body>
<h3>수정페이지</h3>
<form id="postForm" action="/board/modifyPage" method="post">
<div class="input_text">
	<label>번호</label>
	<input name="bno" readonly="readonly" value="${modify.bno}" />
</div>
<div class="input_text">
	<label>제목</label>
	<input name="title" value="${modify.title}" />
</div>
<div class="input_text">
	<label>내용</label>
	<textarea rows="5" name="content"><c:out value="${modify.content}" /></textarea>
</div>
<div class="input_text">
	<label>작성자</label>
	<input name="writer" readonly="readonly" value="${modify.writer}" />
</div>
<div class="input_text">
	<label>작성일</label>
	<input name="regdate" readonly="readonly" value="${modify.regdate}" />
</div>
<div class="input_text">
	<label>수정일</label>
	<input name="updatedate" readonly="readonly"value="${modify.updatedate}" />
</div>
<hr>
<a class="btn" id="btn_modify">수정완료</a>
<a class="btn" id="btn_list">목록페이지</a>
<a class="btn" id="btn_delete">삭제하기</a>
</form>

<form id="getForm">
	<input type="hidden" id="bno" name="bno" value='<c:out value="${modify.bno}" />' />
</form>

<script>
	let postForm = $("#postForm");
	let getForm = $("#getForm");
	
	$("#btn_modify").on("click", function(e){
		
		postForm.submit();
	});
	
	$("#btn_list").on("click", function(e){
		
		getForm.find("#bno").remove();
		getForm.attr("action", "/board/listPage");
		getForm.submit();
	});
	
	$("#btn_delete").on("click", function(e){
		
		getForm.attr("action", "/board/del");
		getForm.attr("method", "post");
		getForm.submit();
	});

</script>
</body>
</html>