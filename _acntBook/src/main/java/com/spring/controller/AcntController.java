package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class AcntController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("key", "Home.jsp 입니다");
		
		return "home";
	}
	
	@RequestMapping("main/index")
	public String indexPage() {
		
		return "main/index";
	}
}
