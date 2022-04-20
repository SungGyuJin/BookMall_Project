package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mapper.BoardMapper;

@Controller
@RequestMapping(value = "/")
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("home", "반갑습니다");
		
		return "home";
	}
	
	@RequestMapping("board/main")
	public String listPage(Model model) {
		
		model.addAttribute("list", mapper.viewList());
		
		return "board/main";
	}
	
	@RequestMapping("board/register")
	public String register() {
		
		return "board/register";
	}
	
}
