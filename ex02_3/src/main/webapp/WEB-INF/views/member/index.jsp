<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br>
	<h2>index Page</h2>
	<input type="button" id="btn_list" value="게시글 조회" />&nbsp;
	<input type="button" id="btn_reg" value="게시글 등록" />&nbsp;
	<input type="button" id="btn_modify" value="게시글 수정" />&nbsp;
	<input type="button" id="btn_del" value="게시글 삭제" />&nbsp;
	
<script type="text/javascript">
	$(document).ready(function(){
		
		
		// 조회
		$("#btn_list").on("click", function(){
			$(location).attr("href", "/member/list")
		})
		
		// 등록
		$("#btn_reg").on("click", function(){
			$(location).attr("href", "/member/reg")
		})
		
		// 수정
		$("#btn_modify").on("click", function(){
			$(location).attr("href", "/member/modify")
		})
		
		// 삭제
		$("#btn_del").on("click", function(){
			$(location).attr("href", "/member/del")
		})
		
	});
</script>
</body>
</html>