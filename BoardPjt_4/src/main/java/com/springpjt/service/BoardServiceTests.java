package com.springpjt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springpjt.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {

	@Autowired
	private BoardService bs;
	
//	@Test
//	public void listTests() {
//		
//		bs.boardListPage();
//	}
	
	@Test
	public void regTest() {
		
		BoardVO bvo = new BoardVO(); 
		
		bvo.setTitle("서비스 테스트 제목");
		bvo.setContent("서비스 테스트 내용");
		bvo.setWriter("서비스 테스트 작성자");
		
		bs.boardRegPage(bvo);
			
	}
}
