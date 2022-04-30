<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<style>
	#tab{
		width: 800px;
		height: 600px;
		text-align: center;
	}
</style>
</head>
<body>
	<h1>목록페이지</h1>
	<a href="/board/enroll">등록하기</a>
	<hr>
	
	<table id="tab" border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>등록일</th>
				<th>수정일</th>
			</tr>		
		</thead>
		<tbody>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><a href="/board/get?bno=${list.bno }"><c:out value="${list.bno }" /></a></td>
				<td><c:out value="${list.title }" /></td>
				<td><c:out value="${list.content }" /></td>
				<td><c:out value="${list.writer }" /></td>
				<td><fmt:formatDate value="${list.regdate }" pattern="yyyy-MM-dd"/></td>
				<td><fmt:formatDate value="${list.updatedate }" pattern="yyyy-MM-dd"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
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