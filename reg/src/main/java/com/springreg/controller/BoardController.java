package com.springreg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springreg.domain.BoardVO;
import com.springreg.service.BoardService;

@Controller
@RequestMapping("/board/*")
//@Log4j
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bs;
	
	// 목록페이지
	@GetMapping("/list") // == @ReqeustMapping(value="list", method=ReqeustMethod.GET)
	public void boardListGET(Model model) {
		
		model.addAttribute("list", bs.getList());
		
		log.info("게시판 조회페이지 진입");
	}
	
	// 등록페이지
	@GetMapping("/enroll") // == @RequestMapping(value="enroll", method=RequestMethod.GET)
	public void boardEnrollGET() {
		
		log.info("게시판 등록페이지 진입");
	}
	
	// 게시판 등록
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board) {
		
		log.info("BoardVO : " + board);
		
		bs.enroll(board);
		
		return "redirect:/board/list";
		
	}
	
}
