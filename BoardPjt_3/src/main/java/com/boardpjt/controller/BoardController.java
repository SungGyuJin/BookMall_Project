package com.boardpjt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boardpjt.model.BoardVO;
import com.boardpjt.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("/listPage")
	public void boardListPage(Model model) {
		
		model.addAttribute("boardList", bservice.boardList());
		
	}
	
//	@GetMapping("/regPage")
//	public String boardRegPage(BoardVO bvo) {
//		
//		
//		
//		return "redirect:/board/regPage";
//	}
}
