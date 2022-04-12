package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@RequestMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("key", "반갑습니다");
		
		return "home";
	}
	
	@RequestMapping("test/viewPage")
	public String viewJsp(Model model) {
		
		
		
		return "test/viewPage";
	}
	
}
