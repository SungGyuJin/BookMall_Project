package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.AuthorVO;
import com.vam.service.AuthorService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin")
@Log4j
public class AdminController {
	
	@Autowired
	private AuthorService authorService;
	
	// 관리자 페이지 이동 메서드
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void adminMainGET() throws Exception{
		
		log.info("관리자페이지 이동");
		
	}
	
	// 상품관리 페이지 접속
	@RequestMapping(value = "goodsManage", method = RequestMethod.GET)
	public void goodsManageGET() throws Exception{
		
		log.info("상품관리 페이지 접속");
	}
	
	// 상품등록 페이지 접속
	@RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
	public void goodsEnrollGET() throws Exception{
		
		log.info("상품등록 페이지 접속");
	}

	// 작가등록 페이지 접속
	@RequestMapping(value = "authorEnroll", method = RequestMethod.GET)
	public void authorEnrollGET() throws Exception{

		log.info("작가등록 페이지 접속");
		
	}

	// 작가관리 페이지 접속
	@RequestMapping(value = "authorManage", method = RequestMethod.GET)
	public void authorManageGET() throws Exception{
		
		log.info("작가관리 페이지 접속");
	}
	
	// 작가등록
	@RequestMapping(value = "authorEnroll", method = RequestMethod.POST)
	public String authorEnrollGET(AuthorVO author, RedirectAttributes rttr) throws Exception{
		
		log.info("authorEnroll : " + author);
		
		authorService.authorEnroll(author);		// 작가등록 쿼리 수행
		
		rttr.addFlashAttribute("enroll_result", author.getAuthorName());		// 등록성공 메시지(작가이름)
		
		return "redirect:/admin/authorManage";
	}
	
	
	
}
