package com.vam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vam.model.AuthorVO;
import com.vam.model.BookVO;
import com.vam.model.Criteria;
import com.vam.model.PageDTO;
import com.vam.service.AdminService;
import com.vam.service.AuthorService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin")
@Log4j
public class AdminController {
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private AdminService adminService;
	
	// 관리자 페이지 이동 메서드
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void adminMainGET() throws Exception{
		
		log.info("관리자페이지 이동");
		
	}
	
	// 상품관리 페이지 접속
	@RequestMapping(value = "goodsManage", method = RequestMethod.GET)
	public void goodsManageGET(Criteria cri, Model model) throws Exception{
		
		log.info("상품관리 페이지 접속");
		
		// 상품 리스트 데이터
		List list = adminService.goodsGetList(cri);
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
		}else {
			model.addAttribute("listCheck", "empty");
			return;
		}
		
		model.addAttribute("pageMaker", new PageDTO(cri, adminService.goodsGetTotal(cri)));
	}
	
	// 상품등록 페이지 접속
	@RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
	public void goodsEnrollGET(Model model) throws Exception{
		
		log.info("상품등록 페이지 접속");
		
		ObjectMapper objm = new ObjectMapper();
		
		List list = adminService.cateList();
		
		String cateList = objm.writeValueAsString(list);
		
		model.addAttribute("cateList", cateList);
		
		log.info("변경 전......" + list);
		log.info("변경 후......" + cateList);
		
	}
	
	// 상품조회 페이지
	@GetMapping({"/goodsDetail", "/goodsModify"})
	public void goodsGetInfoGET(int bookId, Criteria cri, Model model) throws JsonProcessingException {
		
		log.info("goodsGetInfo()..." + bookId);
		
		ObjectMapper mapper = new ObjectMapper();
		
		// 카테고리 리스트 데이터
		model.addAttribute("cateList", mapper.writeValueAsString(adminService.cateList()));
		
		// 목록페이지 조건정보
		model.addAttribute("cri", cri);
		
		// 조회페이지 정보
		model.addAttribute("goodsInfo", adminService.goodsGetDetail(bookId));
	}
	
	// 상품정보 수정
	@PostMapping("/goodsModify")
	public String goodsModifyPOST(BookVO vo, RedirectAttributes rttr) {
		
		log.info("goodsModifyPOST..." + vo);
		
		int result = adminService.goodsModify(vo);
		
		rttr.addFlashAttribute("modify_result", result);

		System.out.println("modify_result: " + result);
		
		return "redirect:/admin/goodsManage";
		
	}
	
	// 상품정보 삭제
	@PostMapping("/goodsDelete")
	public String goodsDeletePOST(int bookId, RedirectAttributes rttr) {
		
		log.info("goodsDeletePOST...");
		
		int result = adminService.goodsDelete(bookId);
		
		rttr.addFlashAttribute("delete_result", result);
		
		System.out.println("delete_result: " + result);
		
		return "redirect:/admin/goodsManage";
	}
	
	// 작가등록 페이지 접속
	@RequestMapping(value = "authorEnroll", method = RequestMethod.GET)
	public void authorEnrollGET() throws Exception{

		log.info("작가등록 페이지 접속");
		
	}

	// 작가관리 페이지 접속
	@RequestMapping(value = "authorManage", method = RequestMethod.GET)
	public void authorManageGET(Criteria cri, Model model) throws Exception{
		
		log.info("작가관리 페이지 접속......." + cri);
		
		// 작가목록 출력 데이터
		List list = authorService.authorGetList(cri);
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
		}else {
			model.addAttribute("listCheck", "empty");
		}
		
		// 페이지 이동 인터페이스 데이터
		model.addAttribute("pageMaker", new PageDTO(cri, authorService.authorGetTotal(cri)));
		
		
	}
	
	// 작가등록
	@RequestMapping(value = "authorEnroll", method = RequestMethod.POST)
	public String authorEnrollGET(AuthorVO author, RedirectAttributes rttr) throws Exception{
		
		log.info("authorEnroll : " + author);
		
		authorService.authorEnroll(author);		// 작가등록 쿼리 수행
		
		rttr.addFlashAttribute("enroll_result", author.getAuthorName());		// 등록성공 메시지(작가이름)
		
		return "redirect:/admin/authorManage";
	}
	
	// 작가 상세페이지, 수정페이지
	@GetMapping({"/authorDetail", "/authorModify"})
	public void authorGetInfoGET(int authorId, Criteria cri, Model model) throws Exception{
		
		log.info("authorDetail......" + authorId);
		
		// 작가 관리페이지 정보
		model.addAttribute("cri", cri);
		
		// 선택 작가정보
		model.addAttribute("authorInfo", authorService.authorGetDetail(authorId));
	}
	
	// 작가정보 수정
	@PostMapping("/authorModify")
	public String authorModifyPOST(AuthorVO author, RedirectAttributes rttr) throws Exception{
		
		log.info("authorModifyPOST......" + author);
		
		int result = authorService.authorModify(author);
		
		rttr.addFlashAttribute("modify_result", result);
		
		return "redirect:/admin/authorManage";
	}
	
	// 작가정보 삭제
	@PostMapping("/authorDelete")
	public String authorDeletePOST(int authorId, RedirectAttributes rttr) {
		
		log.info("authorDeletePOST...");
		
		int result = 0;
		
		try {
			
			result = authorService.authorDelete(authorId);
		}catch (Exception e){
			e.printStackTrace();
			result = 2;
			rttr.addFlashAttribute("delete_result", result);
			
			return "redirect:/admin/authorManage";
		}
		
		rttr.addFlashAttribute("delete_result", result);
		
		return "redirect:/admin/authorManage";
	}
	
	// 상품등록
	@PostMapping("/goodsEnroll")
	public String goodsEnrollPOST(BookVO book, RedirectAttributes rttr) {
		
		log.info("goodsEnrollPOST......" + book);
		
		adminService.bookEnroll(book);
		
		rttr.addFlashAttribute("enroll_result", book.getBookName());
		
		return "redirect:/admin/goodsManage";
	}
	
	// 작가 검색 팝업창
	@GetMapping("/authorPop")
	public void authorPopGET(Criteria cri, Model model) throws Exception{
		
		log.info("authorPopGET......");
		
		cri.setAmount(5);
		
		// 게시물 출력
		List list = authorService.authorGetList(cri);
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);			// 작가 존재하는 경우
		}else {
			model.addAttribute("listCheck", "empty");	// 작가 존재하지 않는 경우
		}
		
		// 페이지이동 인터페이스
		model.addAttribute("pageMaker", new PageDTO(cri, authorService.authorGetTotal(cri)));
	}
	
	// 첨부파일 업로드
	@PostMapping("/uploadAjaxAction")
	public void	uploadAjaxActionPOST(MultipartFile[] uploadFile) {
		 
		log.info("uploadAjaxActionPOST......");
		
		// 향상된 for
		for(MultipartFile multiparfile : uploadFile) {
			
			log.info("------------------------------");
			log.info("파일 이름: " + multiparfile.getOriginalFilename());
			log.info("파일 타입: " + multiparfile.getContentType());
			log.info("파일 크기: " + multiparfile.getSize());
		}
		
		// 기본 for
		for(int i = 0; i < uploadFile.length; i++) {
			
			log.info("------------------------------");
			log.info("파일 이름: " + uploadFile[i].getOriginalFilename());
			log.info("파일 타입: " + uploadFile[i].getContentType());
			log.info("파일 크기: " + uploadFile[i].getSize());
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
