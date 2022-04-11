package com.springpjt.controllerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springpjt.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping(value = "/")
@Log4j
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/")
	public String main(Model model) {
		
		System.out.println("home완료");
		model.addAttribute("hi", "반가워요");
		return "home";
	}
	
	@RequestMapping("board/test")
	public String test(Model model) {
		
		System.out.println("test작동");
		
		model.addAttribute("viewAll", boardService.viewAll());
		
		return "board/test";
	}
	
	@RequestMapping("board/boardList")
	public String board(Model model) {
		
		model.addAttribute("viewAll", boardService.viewAll());
		  System.out.println("조회페이지 작동완료");
		
		return "board/boardList";
	}
	
	@GetMapping("detail")
	public String viewDetail(Model model, @RequestParam("seq")int seq) {
	  
	  model.addAttribute("board", boardService.viewDetail(seq));
	  
	  //조회수 +1
	  boardService.plusCnt(seq);
	  System.out.println("상세페이지 작동완료");
	  
	  return "board/viewDetail";
	}
}
