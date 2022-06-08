<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/main.css">
</head>
<body>
<h1>관리자 메인 페이지</h1>


	<div class="wrapper">
		<div class="wrap">
			<!-- gnb_aera -->
			<div class="top_gnb_area">
				<ul class="list">
					<li><a href="/main">메인 페이지</a>
					<li><a href="/member/logout.do">로그아웃</a>
					<li>고객센터</li>
				</ul>
			</div>
			
			<!-- top_subject_area -->
			<div class="admin_top_wrap">
				<span>관리자 페이지</span>
			</div>
			<!-- contents-area -->
			<div class="admin_wrap">
				<!-- nav 영역 -->
				<div class="admin_navi_wrap">
					<ul>
						<li>
							<a class="admin_list_01">상품등록</a>
						</li>
						<li>
							<a class="admin_list_02">상품목록</a>
						</li>
						<li>
							<a class="admin_list_03">작가등록</a>
						</li>
						<li>
							<a class="admin_list_04">작가관리</a>
						</li>
						<li>
							<a class="admin_list_05">회원관리</a>
						</li>
					</ul>
					<!-- 
						<div class="admin_list_01>
							<a>상품관리</a>
						</div>
					 -->
				</div>
				<div class="admin_content_wrap">
					<div>관리자 페이지 입니다.</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
</body>
</html>