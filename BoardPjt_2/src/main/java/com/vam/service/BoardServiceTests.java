package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	// 등록테스트
//	@Test
//	public void reg(BoardVO board) {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("서비스1");
//		vo.setContent("서비스1");
//		vo.setWriter("서비스1");
//		
//		service.reg(board);
//	}
	
	// 상세조회 테스트
//	@Test
//	public void List() {
//		
//		int bno = 3;
//		
//		service.detailList(bno);
//		
//	}
	
	// 삭제
	@Test
	public void delTest() {
		
		int bno = 3;
		
		service.boardDelete(bno);
	}
	
	
}
