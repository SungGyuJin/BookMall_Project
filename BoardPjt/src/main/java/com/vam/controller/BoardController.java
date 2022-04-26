package com.vam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vam.model.BoardVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	
	@GetMapping("list")
	public void BoardListGET() {
		
		log.info("목록페이지 진입");
	}
	
	@GetMapping("/enroll")
	public void boardEnrollGET() {
		
		log.info("등록페이지 진입");
	}
	
	@PostMapping("/enroll")
	public void boardEnrollPOST(BoardVO board) {
		
		log.info("BoardVO : " + board);
	}
	
}
