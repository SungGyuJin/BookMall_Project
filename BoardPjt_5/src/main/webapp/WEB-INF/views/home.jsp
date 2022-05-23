<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
<style>
	.btn{
		cursor: pointer;
	}
</style>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form id="fm">
	<table border="1">
		<tr>
			<td>
				<a class="btn" id="listMove">목록페이지</a>
			</td>
			<td>
				<a class="btn" id="regMove">등록하기</a>
			</td>
		</tr>
	</table>
</form>

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
</script>
</body>
</html>
