package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("list")
	// RequestMapping(value="list", method=RequestMethod.GET)
	public String BoardListGET(Model model) {
		
		model.addAttribute("list", bservice.viewList());
		
		log.info("목록페이지 진입");
		
		return "board/list";
	}
	
	@GetMapping("/enroll")
	public void boardEnrollGET(Model model) {
		
		log.info("등록페이지 진입");
		
	}
	
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		
		log.info("BoardVO : " + board);
		
		
		bservice.enroll(board);
		
		rttr.addFlashAttribute("result", "enrol success");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
	}
	
	// 수정페이지 이동
	@GetMapping("/modify")
	public void boardModifyGET(int bno, Model model) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
	}
	
	// 수정
	@PostMapping("/modify")
	public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
		
		bservice.modify(board);
		
		rttr.addFlashAttribute("result", "modify success");
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/delete")
	public String boardDeletePOST(int bno, RedirectAttributes rttr) {
		
		bservice.delete(bno);
		
		bservice.delete(bno);
		
		rttr.addFlashAttribute("result", "delete success");
		
		return "redirect:/board/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
