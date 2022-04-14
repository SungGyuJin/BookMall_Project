package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mapper.AcntMapper;

@Controller
@RequestMapping(value = "/")
public class AcntController {
	
	@Autowired
	private AcntMapper mapper;
	
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
