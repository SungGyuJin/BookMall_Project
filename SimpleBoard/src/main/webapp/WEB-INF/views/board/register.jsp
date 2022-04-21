<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 등록페이지</h1>
	<form role="form" action="/board/register" method="post">
		<table border="1" style="text-align: center;">
			<tr>
				<td>닉네임</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="nickname"/>
				</td>
			</tr>
			<tr>
				<td>제목</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="title"/>
				</td>
			</tr>
			<tr>
				<td>내용</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="content"/>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="등록"/></td>
			</tr>
		</table>
	</form>
	
	<br>
	<a href="../board/main">메인페이지</a>
</body>
</html>