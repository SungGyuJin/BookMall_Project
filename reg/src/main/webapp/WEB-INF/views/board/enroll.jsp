<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 등록</h1>

	<form action="/board/enroll" method="post">
		<div class="input_wrap">
			<label>닉네임</label>
			<input name="nickname" />
		</div>
		<div class="input_wrap">
			<label>제목</label>
			<input name="title" />
		</div>
		<div class="input_wrap">
			<label>내용</label>
			<input name="content" />
		</div>
		<button class="btn_reg">등록</button>
	</form>

</body>
</html>