package com.spring.controller;

import java.util.ArrayList;
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

	int year = cal.get(Calendar.YEAR); // 년
	int month = cal.get(Calendar.MONTH); // 월
	int date = cal.get(Calendar.DATE); // 일
	
	ArrayList<Integer> dateList = new ArrayList<>();
	
	@Autowired
	private AcntMapper mapper;

	@RequestMapping("/")
	public String home(Model model) {

		model.addAttribute("key", "Home.jsp 입니다");
		
		return "home";
	}
	
	@RequestMapping("main/index")
	public String indexPage(Model model, AcntVO avo) {
		
		cal.set(year, month, 1); 
		
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 세팅된 달력의 말일자

		model.addAttribute("cont", mapper.contentView(avo));

		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("date", date);
		model.addAttribute("lastDate", lastDate);

		dateList.add(3);
		dateList.add(2);
		dateList.add(3);
		
		if(dateList.size() != 0) {
			dateList.clear();
		}
		
		System.out.println("어레이사이즈: " + dateList.size());
		
		System.out.println("말일: " + lastDate); 
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(date);

		return "main/index";
	}
}
