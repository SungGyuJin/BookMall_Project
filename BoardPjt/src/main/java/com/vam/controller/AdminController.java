package com.vam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin")
@Log4j
public class AdminController {
	
	// 관리자 페이지 이동 메서드
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public void adminMainGET() throws Exception{
		
		log.info("관리지 페이지 이동");
		
	}
	
}
