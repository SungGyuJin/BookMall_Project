package com.vam.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vam.model.MemberVO;
import com.vam.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	
	@Autowired
	private JavaMailSender mailSender;

	// 가입페이지 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void joinGET() {
		
		log.info("회원가입페이지 진입");
	}
	
	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception{
		
		log.info("join 진입");
		
		memberservice.memberJoin(member);
		
		log.info("join Service  성공");
		
		return "redirect:/main";
	}
	
	// 로그인페이지 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET() {
		
		log.info("로그인페이지 진입");
	}
	
	// 아이디 중복 검사
	@RequestMapping(value = "/memberIdChk", method = RequestMethod.POST)
	@ResponseBody
	public String memberIdChkPOST(String memberId) throws Exception{
		
		log.info("memberIdChk() 진입");
		
		int result = memberservice.idCheck(memberId);
		
		log.info("결과값 = " + result);
		
		if(result != 0) {
			
			return "fail"; // 중복아이디 존재 O
		}else {
			
			return "success"; // 중복아이디 존재 X
		}
		
	} // memberIdChkPOST() 종료
	
	@RequestMapping(value = "/mailCheck", method = RequestMethod.GET)
	@ResponseBody
	public String mailCheckGET(String email) throws Exception{
		
		// View로부터 넘어온 데이터 확인
		log.info("이메일 데이터 전송 확인");
		log.info("인증번호: " + email);
		
		// 인증번호
		Random random = new Random();
		int checkNum = random.nextInt(888888) + 111111;
		
		log.info("인증번호: " + checkNum);
		
		String setFrom = "vkdnjwkrk3@naver.com";
		String toMail = email;
		String title = "회원가입 인증 이메일 입니다.";
		String content = 
				"홈페이지 방문을 환영합니다." +
				"<br><br>" +
				"인증번호는 " + checkNum + "입니다." +
				"<br>" +
				"인증번호 입력란에 입력해주세요.";
		
		try {
			
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
			helper.setFrom(setFrom);
			helper.setTo(toMail);
			helper.setSubject(title);
			helper.setText(content, true);
			mailSender.send(message);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String num = Integer.toString(checkNum);
		
		return num;
	}
	
	
	
}
