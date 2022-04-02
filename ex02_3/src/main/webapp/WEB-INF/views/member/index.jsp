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
	<input type="button" id="btn_test" value="index 버튼" /> <br><br>
	<input type="button" id="btn_move" value="testPage 이동" /> 
	
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#btn_test").on("click", function(){
			alert("확인");
		})
		
		$("#btn_move").on("click", function(){
			$(location).attr("href", "/member/test")
		})
		
	});
</script>
</body>
</html>