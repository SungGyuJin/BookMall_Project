<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<h1>목록페이지</h1>
	<a href="/board/enroll">등록하기</a>
</body>
<script>
	$(document).ready(function(){
		
		let result = '<c:out value="${result}" />';
		
		checkAlert(result);
		
		function checkAlert(result){
			
			if(result === ''){
				return;
			}
			
			if(result === "enrol success"){
				alert("등록완료!!");
			}
		}
		
		
	});

</script>
</html>