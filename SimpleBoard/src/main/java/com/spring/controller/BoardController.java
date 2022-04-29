package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.BoardVO;
import com.spring.service.impl.BoardDAOService;

@Controller
@RequestMapping(value = "/")
public class BoardController {
	
	@Autowired
	private BoardDAOService boardServiceImpl;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("home", "반갑습니다");
		
		return "home";
	}
	
	// 조회
	@RequestMapping("board/main")
	public String listPage(Model model) {
		
		model.addAttribute("list", boardServiceImpl.viewList());
		
		return "board/main";
	}
	
	@RequestMapping("board/register")
	public String register(BoardVO bvo) {
		
		boardServiceImpl.insertBoard(bvo);
		
		return "redirect:/board/main";
	}
	
//	@GetMapping("board/register")
//	public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) {
//		
//		boardServiceImpl.insertBoard(boardVO);
//		
//		return "redirect:/board/main";
//	}
	
}
