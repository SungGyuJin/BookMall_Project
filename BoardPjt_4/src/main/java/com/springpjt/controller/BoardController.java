package com.springpjt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springpjt.model.BoardVO;
import com.springpjt.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/boardList")
	public void boardListPage(Model model) {
		
		model.addAttribute("listPage", bs.boardListPage());
	}
	
	@GetMapping("/boardReg")
	public void boardRegGET() {}
	
	@PostMapping("/boardReg")
	public String boardRegPOST(BoardVO bvo) {
		
		return "redirect:/board/boardList";
	}

}
