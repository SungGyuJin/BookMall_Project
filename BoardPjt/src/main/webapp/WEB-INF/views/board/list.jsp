<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
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
	<div class="table table-info table-hover">
	<h1>목록페이지</h1>
	<table id="tab" border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록일</th>
				<th>수정일</th>
			</tr>		
		</thead>
		<tbody>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><c:out value="${list.bno }" /></td>
				<td>
					<a class="move" href='<c:out value="${list.bno }"/>'>
						<c:out value="${list.title }" />
					</a>
				</td>
				<td><c:out value="${list.writer }" /></td>
				<td><fmt:formatDate value="${list.regdate }" pattern="yyyy-MM-dd"/></td>
				<td><fmt:formatDate value="${list.updatedate }" pattern="yyyy-MM-dd"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="pageInfo_wrap">
		<div class="pageInfo_area">
			<ul id="pageInfo" class="pageInfo">
				
				<!-- 이전페이지 -->
				<c:if test="${pageMaker.prev}">
					<li class="pageInfo_btn previous"><a href="${pageMaker.startPage - 1}">Previous</a></li>
				</c:if>
				
				<!-- 각 번호 페이지 버튼 -->
				<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
					<li class="pageInfo_btn ${pageMaker.cri.pageNum == num ? "active":"" }"><a href="${num}">${num}</a></li>
				</c:forEach>
				
				<!-- 다음페이지 버튼 -->
				<c:if test="${pageMaker.next}">
					<li class="pageInfo_btn next"><a href="${pageMaker.endPage + 1}">Next</a></li>
				</c:if>
				
			</ul>
		</div>
	</div>
	
	<form id="moveForm" method="get">
		<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
		<input type="hidden" name="amount" value="${pageMaker.cri.amount }">
	</form>
</body>
<script>
$(document).ready(function(){
		
		let result = '<c:out value="${result}"/>';
		
		checkAlert(result);
		console.log(result);
		
		function checkAlert(result){
			
			if(result === ''){
				return;
			}
			
			if(result === "enrol success"){
				alert("등록완료!!");
			}
			
			if(result === "modify success"){
				alert("수정완료!!");
			}
			
			if(result === "delete success"){
				alert("삭제완료!!");
			}
		}
		
});
	
	let moveForm = $("#moveForm");
	
	$(".move").on("click", function(e){
		
		e.preventDefault();
		
		moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+"'>");
		moveForm.attr("action", "/board/get");
		moveForm.submit();
	});
	
	$(".pageInfo a").on("click", function(e){
		
		e.preventDefault();
		moveForm.find("input[name='pageNum']").val($(this).attr("href"));
		moveForm.attr("action", "/board/list");
		moveForm.submit();
	});
	
	

</script>
</html>