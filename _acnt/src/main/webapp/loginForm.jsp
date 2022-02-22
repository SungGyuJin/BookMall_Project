<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background-image: url("money.jpg");
		background-size: cover;
	}
	table{
		margin: auto;
		width: 400px;
		height: 200px;
		font-size: x-large;
		text-align: center;
		background-color: white;
		margin-top: 50px;
	}
	input{
		width: 200px;
		height: 50px;
		font-size: x-large;
		border: none;
	}
</style>
</head>
<body>
<form action="loginPro.jsp" method="post">
	<table border="30">
		<thead>
			<tr>
				<td style="font-style: italic;" align="center" colspan="2"><h1>Save!!</h1></td>
			</tr>
		<thead>
		<tbody>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" id="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" id="pw"></td>
			</tr>
			<tr>
				<td><input type="submit" value="LOGIN"></td>
				<td><input type="button" value="JOIN" onclick="location.href='joinpage.jsp'"></td>
			</tr>
		</tbody>
	</table>
</form>
<script type="text/javascript">
	window.history.forward();
	function noBack(){
		window.history.forward();
	}
</script>
</body>
</html>