package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("")
	public String main(Model model) {
		
		model.addAttribute("save", "반가워요~~");
		
		return "home";
	}
	
}
