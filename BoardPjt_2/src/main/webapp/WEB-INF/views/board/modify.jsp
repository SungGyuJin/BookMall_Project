<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../board/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><style type="text/css">
.input_wrap{
	padding: 5px 20px;
}
label{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}
input{
	padding: 5px;
    font-size: 17px;
}
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
}
.btn{
  	display: inline-block;
    font-size: 22px;
    padding: 6px 12px;
    background-color: #fff;
    border: 1px solid #ddd;
    font-weight: 600;
    width: 140px;
    height: 41px;
    line-height: 39px;
    text-align : center;
    margin-left : 30px;
    cursor : pointer;
}
.btn_wrap{
	padding-left : 80px;
	margin-top : 50px;
}
#delete_btn{
	background-color: pink;
}
</style>
</head>
<body>
<h1>수정페이지</h1>
<form id="modifyForm" action="/board/modify" method="post">
<table border="1" style="text-align: center;">
	<tr>
		<td>게시글 번호</td>
		<td><input name="bno" readonly="readonly" value='<c:out value="${detail.bno}"/>' ></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input name="title" value='<c:out value="${detail.title}"/>'></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea name="content" rows="5"><c:out value="${detail.content}"/></textarea>
		</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input name="writer" readonly="readonly" value='<c:out value="${detail.writer}"/>'></td>
	</tr>
	<tr>
		<td>등록일</td>
		<td><input name="regdate" readonly="readonly" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${detail.regdate}"/>'/></td>
	</tr>
	<tr>
		<td>수정일</td>
		<td><input name="updatedate" readonly="readonly" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${detail.updatedate}"/>'/></td>
	</tr>
</table>
<div class="btn_wrap">
	<a class="btn" id="modify_btn">수정완료</a>
	<a class="btn" href="/board/list">리스트</a>
</div>
</form>
<br>

<script>
	let mform = $("#modifyForm");
	
	$("#modify_btn").on("click", function(e){
		
		mform.submit();
	});
</script>
</body>
</html>