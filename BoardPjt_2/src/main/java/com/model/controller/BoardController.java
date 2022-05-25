package com.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;
import com.vam.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGET() {
		
		log.info("메인 진입");
	}
	
	@GetMapping("/reg")
	public void boardRegGET() {
		
	}
	
	@PostMapping("/reg")
	public String boardRegPOST(BoardVO board) {
		
		bservice.reg(board);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/list")
	public String boardListPage(Model model, Criteria cri) {
		
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
	
	@PostMapping("/delete")
	public String deletePOST(int bno) {
		
		bservice.boardDelete(bno);
		
		return "redirect:/board/list";
	}
	
	
}
