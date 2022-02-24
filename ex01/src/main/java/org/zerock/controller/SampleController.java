package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basicGet() {

		log.info("basic....");
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet2() {

		log.info("basic only get....");
	}

	@GetMapping("/ex01")
	public String ex01j(SampleDTO dto) {

		log.info("" + dto);
		System.out.println("ex01 실행");

		return "ex01";
	}

	@RequestMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
		log.info("name: " + name);
		log.info("age: " + age);
		System.out.println("ex02 실행");

		model.addAttribute("model", name);

		return "ex02";
	}

	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {

		log.info("dto:" + dto);
		log.info("page: " + page);

		return "/sample/ex04";
	}

	@GetMapping("/ex05") // URL 경로 // Mapping 타이핑할때마다 오른쪽에 주석으로 적는 습관을 가지자
	public void ex05() {

		log.info("/ex05.....");
		System.out.println("ex05 시스아웃");
	}

	@GetMapping("ex06")
	public @ResponseBody SampleDTO ex06() {
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		return dto;
	}

}
