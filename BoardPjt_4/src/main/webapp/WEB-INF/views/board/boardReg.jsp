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
<h2>등록페이지</h2>
<form id="regForm">
<table border="1">
	<tr>
		<td>제목</td>
		<td><input name="title" /></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea name="content" rows="5"></textarea>
		</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input name="writer" />
	</tr>
	<tr>
		<td colspan="2" style="background-color: pink; text-align: center;"> 
			<a class="btn" id="btn_reg">등록</a>
		</td>
	</tr>
</table>
</form>
<script>
	
	let regForm = $("#regForm");
	
	$("#btn_reg").on("click", function(e){
		
		regForm.attr("action", "/board/boardReg");
		regForm.attr("method", "post");
		regForm.submit();
	});
	
</script>
</body>
</html>