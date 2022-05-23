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
<h2>등록페이지</h2>
	
<form id="regForm" action="/board/reg" method="post">
	<div class="input_wrap">
		<label>제목</label>
		<input id="title" name="title" />
	</div>
	<div class="input_wrap">
		<label>내용</label>
		<textarea id="content" name="content" rows="5"></textarea>
	</div>
	<div class="input_wrap">
		<label>작성자</label>
		<input id="writer" name="writer" />
	</div>
	<a class="btn" id="btn_reg">등록</a>
</form>
<script>
	
	let regForm = $("#regForm");
	
	$("#btn_reg").on("click", function(e){
		
		if($("#title").val() == ""){
			alert("제목 입력!!");
			$("#title").focus();
			return false;
		}
		if($("#content").val() == ""){
			alert("내용 입력!!");
			$("#content").focus();
			return false;
		}
		if($("#writer").val() == ""){
			alert("작성자 입력!!");
			$("#writer").focus();
			return false;
		}
		alert("등록완료");
		regForm.submit();
	});
	
</script>
</body>
</html>