package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vam.model.MemberVO;
import com.vam.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	private MemberService memberservice;

	// 가입페이지 이동
	@RequestMapping(value="join", method=RequestMethod.GET)
	public void joinGET() {
		
		log.info("회원가입페이지 진입");
	}
	
	
	// 회원가입
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception{
		
		log.info("join 진입");
		
		memberservice.memberJoin(member);
		
		log.info("join Service  성공");
		
		return "redirect:/main";
	}
	
	
	// 로그인페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {
		
		log.info("로그인페이지 진입");
	}
}
