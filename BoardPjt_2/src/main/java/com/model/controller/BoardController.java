package com.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("/reg")
	public void boardRegGET() {
		
	}
	
	@PostMapping("/reg")
	public String boardRegPOST(BoardVO board) {
		
		bservice.reg(board);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/list")
	public String boardListPage(Model model) {
		
		model.addAttribute("list", bservice.boardList());
		
		return "board/list";
	}
	
	@GetMapping("/detail")
	public void detailList(Model model, int bno) {
		
		model.addAttribute("detail", bservice.detailList(bno));
		
	}
	
	@GetMapping("/modify")
	public void modifyMove(Model model, int bno) {
		
		model.addAttribute("detail", bservice.detailList(bno));
	}
	
	@PostMapping("/modify")
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) {
		
		bservice.boardUpdate(board);

		rttr.addFlashAttribute("result", "modify success");
		
		return "redirect:/board/list";
	}
	
	
}
