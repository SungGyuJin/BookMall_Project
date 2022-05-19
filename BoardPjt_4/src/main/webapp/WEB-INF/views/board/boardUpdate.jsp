<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
label{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}
input{
	padding: 5px;
    font-size: 17px;
}
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
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
.inputField{
	padding-left : 80px;
	margin-top : 50px;
}
#btn_delete{
	background-color: pink;
}
</style>
</head>
<body>
<h2>수정페이지</h2>
<form id="modifyForm" action="/board/boardUpdate" method="post">
	<div class="inputField">
		<label>번호</label>
		<input name="bno" readonly="readonly" value="<c:out value='${detailPage.bno}' />"/>
	</div>
	<div class="inputField">
		<label>제목</label>
		<input name="title" value="<c:out value='${detailPage.title}' />"/>
	</div>
	<div class="inputField">
		<label>내용</label>
		<textarea name="content" rows="5"><c:out value="${detailPage.content}" /></textarea>
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
		<a class="btn" id="btn_modify">수정완료</a>
		<a class="btn" id="btn_list">목록페이지</a>
		<a class="btn" id="btn_delete">삭제</a>
		<a class="btn" id="btn_cancel">취소</a>
	</div>
</form>

<form id="moveForm">
	<input type="hidden" name="bno" id="bno" value="<c:out value='${detailPage.bno}'/>" />
</form>
<script>
	
	let modifyForm = $("#modifyForm");
	let moveForm = $("#moveForm");
	
	$("#btn_modify").on("click", function(e){
		
		modifyForm.submit();
	});
	
	$("#btn_list").on("click", function(e){
	
		moveForm.find("#bno").remove();
		moveForm.attr("action", "/board/boardList");
		moveForm.submit();
	});
	
	$("#btn_delete").on("click", function(e){
		
		moveForm.attr("action", "/board/del");
		moveForm.attr("method", "post");
		moveForm.submit();
	});
	
	
	
	
</script>
</body>
</html>