<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/admin/goodsEnroll.css">
</head>
<body>
	
	<div class="wrapper">
		<div class="wrap">
			<!-- gnb_area -->
			<div class="top_gnb_area">
				<ul class="list">
					<li><a href="/main">메인페이지</a>
					<li><a href="/member/logout.do">로그아웃</a>
					<li>고객센터</li>
				</ul>
			</div>
			<!-- top_subject_area -->
			<div class="admin_top_wrap">
				<span>관리자 페이지</span>
			</div>
			
			<!-- contents_area -->
			<div class="admin_wrap">
				<!-- 네비영역 -->
				<div class="admin_navi_wrap">
					<ul>
						<li>
							<a class="admin_list_01" href="/admin/goodsEnroll">상품등록</a>
						</li>
						<li>
							<a class="admin_list_02" href="/admin/goodsManage">상품관리</a>
						</li>
						<li>
							<a class="admin_list_03" href="/admin/authorEnroll">작가등록</a>
						</li>
						<li>
							<a class="admin_list_04" href="/admin/authorManage">작가관리</a>
						</li>
						<li>
							<a class="admin_list_05">회원관리</a>
						</li>
					</ul>
				</div>	
				<div class="admin_content_wrap">
					<div class="admin_content_subject"><span>상품등록</span></div>
				</div>
				<div class="clearfix"></div>
			</div>
			
			<!-- Footer 영역 -->
			<div class="footer_nav">
				<div class="footer_nav_container">
					<ul>
						<li>회사소개</li>
						<span class="line">|</span>
						<li>이용약관</li>
						<span class="line">|</span>
						<li>고객센터</li>
						<span class="line">|</span>
						<li>광고문의</li>
						<span class="line">|</span>
						<li>채용정보</li>
						<span class="line">|</span>
					</ul>
				</div>
			</div>	<!-- class="footer_nav" -->
			
			<div class="footer">
				<div class="footer_container">
					
					<div class="footer_left">
						<!-- 이미지파일 -->
					</div>
					<div class="footer_right">
						(주) VamBook		대표이사 : OOO
						<br>
						사업자등록번호 : OOO-OO-OOOOO
						<br>
						대표전화 : OOOO-OOOO (발신자 부담전화)
						<br>
						<br>
						COPYRIGHT(C) <strong>kimvampa.tistory.com</strong>		ALL RIGHTS RESERVED.
					</div>
					<div class="clearfix"></div>
				</div>
			</div> <!-- .footer end -->
			
		
		</div>	<!-- .wrap end -->
	</div>	<!-- .wrapper end -->
</body>
</html>