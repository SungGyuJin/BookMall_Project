package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.MemberDTO;
import com.spring.mapper.MemberMapper;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@Autowired
	private MemberMapper mapper;
	
	@RequestMapping("")
	public String mainPage() {
		
		System.out.println("ex02_3의 home 동작완료");
		return "home";
	}
	
	@RequestMapping("member/index")
	public String headerPage() {
		
		return "member/index";
	}
	
	// 조회
	@RequestMapping("member/list")
	public String list(Model model, MemberDTO dto) {
		
		model.addAttribute("viewList", mapper.viewAll(dto));
		System.out.println("ex02_3 동작완료");
		
		return "member/list";	
	}
	
	// 등록
	@RequestMapping("member/reg")
	public String register(MemberDTO dto) {
		
		return "member/reg";
	}
	
	// 수정
	@RequestMapping("/member/modify")
	public String modify() {
		
		return "member/modify";
	}
	
	// 삭제
	@RequestMapping("/member/del")
	public String del() {
		
		return "member/del";
	}
	
}
