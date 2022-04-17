package com.spring.controller;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.AcntVO;
import com.spring.mapper.AcntMapper;

@Controller
@RequestMapping(value = "/")
public class AcntController {
	
	Calendar cal = Calendar.getInstance();
	
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int date = cal.get(Calendar.DATE);
	
	
	@Autowired
	private AcntMapper mapper;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("key", "Home.jsp 입니다");
		
		return "home";
	}
	
	@RequestMapping("main/index")
	public String indexPage(Model model, AcntVO avo) {
		
		model.addAttribute("cont", mapper.contentView(avo));
		
		model.addAttribute("year", year);
		model.addAttribute("month", month + 1);
		model.addAttribute("date", date);
		
		System.out.println(year);
		
		return "main/index";
	}
}
