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
	
//	@Test
//	public void testEnroll() {
//	
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("service test");
//		vo.setContent("service test");
//		vo.setWriter("service test");
//		
//		service.enroll(vo);
//	}
	
//	@Test
//	public void test() {
//		
//		int bno = 2;
//		
//		service.getPage(bno);
//	}
	
//	@Test
//	public void testModify() {
//		
//		BoardVO board = new BoardVO();
//		board.setBno(1);
//		board.setTitle("정");
//		board.setContent("1제목내용");
//		
//		int result = service.modify(board);
//		log.info("result : " + result);
//	}
	
	@Test
	public void testDelete() {
		
		int result = service.delete(22);
		log.info("result : " + result);
	}
}
