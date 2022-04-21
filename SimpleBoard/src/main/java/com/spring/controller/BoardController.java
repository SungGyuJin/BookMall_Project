package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;
import com.spring.service.impl.BoardService;

@Controller
@RequestMapping(value = "/")
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private BoardService boardServiceImpl;
	
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
	
	@GetMapping("board/register")
	public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) {
		
		boardServiceImpl.insertBoard(boardVO);
		
		return "redirect:/board/main";
	}
	
}
