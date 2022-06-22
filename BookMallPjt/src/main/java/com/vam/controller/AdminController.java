package com.vam.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.vam.model.AttachImageVO;
import com.vam.model.AuthorVO;
import com.vam.model.BookVO;
import com.vam.model.Criteria;
import com.vam.model.PageDTO;
import com.vam.service.AdminService;
import com.vam.service.AuthorService;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnails;

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
	public void adminMainGET() throws Exception {

		log.info("관리자페이지 이동");

	}

	// 상품관리 페이지 접속
	@RequestMapping(value = "goodsManage", method = RequestMethod.GET)
	public void goodsManageGET(Criteria cri, Model model) throws Exception {

		log.info("상품관리 페이지 접속");

		// 상품 리스트 데이터
		List list = adminService.goodsGetList(cri);

		if (!list.isEmpty()) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("listCheck", "empty");
			return;
		}

		model.addAttribute("pageMaker", new PageDTO(cri, adminService.goodsGetTotal(cri)));
	}

	// 상품등록 페이지 접속
	@RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
	public void goodsEnrollGET(Model model) throws Exception {

		log.info("상품등록 페이지 접속");

		ObjectMapper objm = new ObjectMapper();

		List list = adminService.cateList();

		String cateList = objm.writeValueAsString(list);

		model.addAttribute("cateList", cateList);

		log.info("변경 전......" + list);
		log.info("변경 후......" + cateList);

	}

	// 상품조회 페이지
	@GetMapping({ "/goodsDetail", "/goodsModify" })
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
	public void authorEnrollGET() throws Exception {

		log.info("작가등록 페이지 접속");

	}

	// 작가관리 페이지 접속
	@RequestMapping(value = "authorManage", method = RequestMethod.GET)
	public void authorManageGET(Criteria cri, Model model) throws Exception {

		log.info("작가관리 페이지 접속......." + cri);

		// 작가목록 출력 데이터
		List list = authorService.authorGetList(cri);

		if (!list.isEmpty()) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("listCheck", "empty");
		}

		// 페이지 이동 인터페이스 데이터
		model.addAttribute("pageMaker", new PageDTO(cri, authorService.authorGetTotal(cri)));

	}

	// 작가등록
	@RequestMapping(value = "authorEnroll", method = RequestMethod.POST)
	public String authorEnrollGET(AuthorVO author, RedirectAttributes rttr) throws Exception {

		log.info("authorEnroll : " + author);

		authorService.authorEnroll(author); // 작가등록 쿼리 수행

		rttr.addFlashAttribute("enroll_result", author.getAuthorName()); // 등록성공 메시지(작가이름)

		return "redirect:/admin/authorManage";
	}

	// 작가 상세페이지, 수정페이지
	@GetMapping({ "/authorDetail", "/authorModify" })
	public void authorGetInfoGET(int authorId, Criteria cri, Model model) throws Exception {

		log.info("authorDetail......" + authorId);

		// 작가 관리페이지 정보
		model.addAttribute("cri", cri);

		// 선택 작가정보
		model.addAttribute("authorInfo", authorService.authorGetDetail(authorId));
	}

	// 작가정보 수정
	@PostMapping("/authorModify")
	public String authorModifyPOST(AuthorVO author, RedirectAttributes rttr) throws Exception {

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
		} catch (Exception e) {
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
	public void authorPopGET(Criteria cri, Model model) throws Exception {

		log.info("authorPopGET......");

		cri.setAmount(5);

		// 게시물 출력
		List list = authorService.authorGetList(cri);

		if (!list.isEmpty()) {
			model.addAttribute("list", list); // 작가 존재하는 경우
		} else {
			model.addAttribute("listCheck", "empty"); // 작가 존재하지 않는 경우
		}

		// 페이지이동 인터페이스
		model.addAttribute("pageMaker", new PageDTO(cri, authorService.authorGetTotal(cri)));
	}

	// 첨부파일 업로드
	@PostMapping(value = "/uploadAjaxAction", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<AttachImageVO>> uploadAjaxActionPOST(MultipartFile[] uploadFile) {

		log.info("uploadAjaxActionPOST......");
		
		// 이미지 파일체크
		for(MultipartFile multipartFile : uploadFile) {
			
			File checkfile = new File(multipartFile.getOriginalFilename());
			String type = null;
			
			try {
				type = Files.probeContentType(checkfile.toPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(!type.startsWith("image")) {
				
				List<AttachImageVO> list = null;
				return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
				
			}
			
			
		}

		String uploadFolder = "C:\\upload";

		// 날짜 폴더 경로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date = new Date();

		String str = sdf.format(date);

		String datePath = str.replace("-", File.separator);

		// 폴더 생성
		File uploadPath = new File(uploadFolder, datePath);

		if (uploadPath.exists() == false) {

			uploadPath.mkdirs();
		}

		// 이미지 정보 담븐 객체
		List<AttachImageVO> list = new ArrayList();
		
		// 향상된 for
		for (MultipartFile multipartFile : uploadFile) {
			
			// 이미지 정보객체
			AttachImageVO vo = new AttachImageVO();

			// 파일이름
			String uploadFileName = multipartFile.getOriginalFilename();
			
			vo.setFileName(uploadFileName);
			vo.setUploadPath(datePath);

			// uuid 적용
			String uuid = UUID.randomUUID().toString();
			vo.setUuid(uuid);

			uploadFileName = uuid + "_" + uploadFileName;

			// 파일위치, 파일 이름을 합친 File 객체
			File saveFile = new File(uploadPath, uploadFileName);

			// 파일저장
			try {
				System.out.println("이미지 저장성공");
				multipartFile.transferTo(saveFile);
				
				/*
				// 썸네일 생성
				File thumbnailFile = new File(uploadPath, "s_" + uploadFileName);
				
				BufferedImage bo_image = ImageIO.read(saveFile);
					
					// 비율
					double ratio = 3;
					
					// 넓이, 높이
					int width = (int) (bo_image.getWidth() / ratio);
					int height = (int) (bo_image.getHeight() / ratio);
				
				BufferedImage bt_image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
				
				Graphics2D graphic = bt_image.createGraphics();
				
				graphic.drawImage(bo_image, 0, 0, width, height, null);
				
				ImageIO.write(bt_image,  "jpg", thumbnailFile);
				 */
				
				// 방법
				File thumbnailFile = new File(uploadPath, "s_" + uploadFileName);
				
				BufferedImage bo_image = ImageIO.read(saveFile);
				
				// 비율
				double ratio = 3;
				
				// 넓이, 높이
				int width = (int) (bo_image.getWidth() / ratio);
				int height = (int) (bo_image.getHeight() / ratio);
				
				Thumbnails.of(saveFile)
				.size(width, height)
				.toFile(thumbnailFile);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			list.add(vo);
			
		} // end for
		
		ResponseEntity<List<AttachImageVO>> result = new ResponseEntity<List<AttachImageVO>>(list, HttpStatus.OK);
		
		return result;
	}


	
	
	
	
	
	
	
	
	
	
}
