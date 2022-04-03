<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<br>
	<input type="button" id="btn_test" value="index Page" /> <br><br>
	<hr>

<script type="text/javascript">
	$(document).ready(function(){
		$("#btn_test").on("click", function(){
			$(location).attr("href", "/member/index")
		})
	})
</script>
</body>
</html>