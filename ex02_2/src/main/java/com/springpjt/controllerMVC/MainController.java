package com.springpjt.controllerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springpjt.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("test")
	public String test(Model model) {
		
		model.addAttribute("viewAll", boardService.viewAll());
		
		return "redirect:/board/test";
	}
}
