<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.btn{
		cursor: pointer;
	}
	
	.td{
		text-align: center;
		width: 100px;
	}
	
</style>
</head>
<body>
<h1>헤더영역</h1>
<form id="fm">
	<table id="tab" border="1">
		<tr>
			<td class="td"><a class="btn" id="homeMove">홈</a></td>
			<td class="td"><a class="btn" id="listMove">목록페이지</a></td>
			<td class="td"><a class="btn" id="regMove">등록하기</a></td>
		</tr>
	</table>
</form>
<hr>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>

	let fm = $("#fm");

	$("#listMove").on("click", function(e){
		
		fm.attr("action", "/board/list");
		fm.submit();
	});

	$("#regMove").on("click", function(e){
		
		fm.attr("action", "/board/reg");
		fm.submit();
	});

	$("#homeMove").on("click", function(e){
		
		fm.attr("action", "/");
		fm.submit();
	});
</script>
</body>
</html>