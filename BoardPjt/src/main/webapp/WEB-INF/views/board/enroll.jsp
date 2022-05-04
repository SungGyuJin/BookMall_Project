<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
}
</style>
</head>
<body>
	<h1>등록페이지</h1>
	<form action="/board/enroll" method="post">
	<table class="table table-info" border="1">
		<tr>
			<td>
				<label>Title</label>
			</td>
			<td>
				<input id="title" name="title" />
			</td>
		</tr>
		<tr>
			<td>
				<label>Content</label>
			</td>
			<td>
				<textarea rows="3" id="content" name="content"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				<label>Writer</label>
			</td>
			<td>
				<input id="writer" name="writer" />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button class="btn_reg" id="btn_reg" onClick="return btn_reg()">등록</button>
			</td>
		</tr>
	</table>
	</form>
<script>

	$("#btn_reg").on("click", function(){
		
		if($("#title").val() == ""){
			alert("제목을 입력해주세요.");
			$("#title").focus();
			return false;
		}

		if($("#content").val() == ""){
			alert("내용을 입력해주세요.");
			$("#content").focus();
			return false;
		}
			
		if($("#writer").val() == ""){
			alert("작성자를 입력해주세요.");
			$("#writer").focus();
			return false;
		}
						
	});
</script>
</body>
</html>