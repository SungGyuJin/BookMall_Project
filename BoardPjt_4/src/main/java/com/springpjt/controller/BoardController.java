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
		
		bs.boardRegPage(bvo);
		
		return "redirect:/board/boardList";
	}
	
	@GetMapping("/boardDetail")
	public void detailMove(Model model, int bno) {

		model.addAttribute("detailPage", bs.detailPage(bno));
	}
	
	@GetMapping("/boardUpdate")
	public void boardUpdateGET(Model model, int bno) {
		
		model.addAttribute("detailPage", bs.detailPage(bno));
	}
	
	@PostMapping("/boardUpdate")
	public String boarUpdatePOST(BoardVO bvo) {
		
		bs.boardUpdate(bvo);
		
		return "redirect:/board/boardList";
	}
	
	@PostMapping("/del")
	public String boardDel(int bno) {
		
		bs.boardDelete(bno);
		
		return "redirect:/board/boardList";
	}
	

}
