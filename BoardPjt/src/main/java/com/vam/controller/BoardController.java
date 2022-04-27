package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public void BoardListGET() {
		
		log.info("목록페이지 진입");
	}
	
	@GetMapping("/enroll")
	public void boardEnrollGET() {
		
		log.info("등록페이지 진입");
	}
	
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board) {
		
		log.info("BoardVO : " + board);
		
		bservice.enroll(board);
		
		return "redirect:/board/list";
	}
	
}
