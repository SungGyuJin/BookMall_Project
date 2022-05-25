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
#tab{
	width: 800px;
	height: 400px;
	text-align: center;
} 
.pageInfo{
      list-style : none;
      display: inline-block;
    margin: 50px 0 0 100px;      
}
.pageInfo li{
      float: left;
    font-size: 20px;
    margin-left: 18px;
    padding: 7px;
    font-weight: 500;
}
 a:link {color:black; text-decoration: none;}
 a:visited {color:black; text-decoration: none;}
 a:hover {color:black; text-decoration: underline;}
 
 .active{
 	background-color: #cdd5ec;
 }
</style>
</head>
<body>
<h1>목록페이지</h1>
	<table border="1" style="text-align: center;">
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>내용</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>수정일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="obj">
				<tr>
					<td><c:out value="${obj.bno }"/></td>
					<td><a href="/board/detail?bno=${obj.bno}"><c:out value="${obj.title }"/></a></td>
					<td><c:out value="${obj.content }"/></td>
					<td><c:out value="${obj.writer }"/></td>
					<td><fmt:formatDate value="${obj.regdate }" pattern="yyyy-MM-dd"/>
					<td><fmt:formatDate value="${obj.updatedate }" pattern="yyyy-MM-dd"/>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="/board/reg">등록</a><br>
	<a href="/">HOME</a>
	
	<div class="list_wrap">
		<div class="pageInfo_area">
			<ul id="pageInfo" class="pageInfo">
				
				<c:if test="${pageMaker.prev}">
					<li class="pageInfo_btn previous"><a href="">Previous</a></li>
				</c:if>
			</ul>
		</div>
	</div>
	
<script>

	
</script>
</body>
</html>