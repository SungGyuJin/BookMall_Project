package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vam.model.BoardVO;
import com.vam.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService bs;
	
	// 목록페이지로 이동
	@GetMapping("/list")
	public void listPage(Model model) {
		
		model.addAttribute("listPage", bs.boardList());
	}
	
	// 등록페이지로 이동
	@GetMapping("/reg")
	public void regPage() {
		
	}
	
	// 등록페이지에서 등록하기
	@PostMapping("/reg")
	public String regPagePOST(BoardVO bvo) {
		
		bs.boardReg(bvo);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/detail")
	public void moveDetail(Model model, int bno) {
		
		model.addAttribute("pageInfo", bs.pageInfo(bno));
	}
	
	@GetMapping("/modify")
	public void moveModifyGET(Model model, int bno) {
		
		model.addAttribute("pageInfo", bs.pageInfo(bno));
		
	}
	
	@PostMapping("/modify")
	public String modifyPOST(BoardVO bvo) {
		
		bs.modify(bvo);
		
		return "redirect:/board/list";
	}
	
	@PostMapping("delete")
	public String del(int bno) {
		
		bs.boardDel(bno);
		
		return "redirect:/board/list";
	}
}
