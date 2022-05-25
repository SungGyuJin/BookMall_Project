package com.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping(value = "/member")
public class MemberController {

	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET() {
		
		log.info("회원가입페이지 진입");
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {
		
		log.info("로그인페이지 진입");
	}
}
