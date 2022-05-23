package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void reg() {
//		
//		BoardVO bvo = new BoardVO();
//		
//		bvo.setTitle("pjt5 제목");
//		bvo.setContent("pjt5 내용");
//		bvo.setWriter("pjt5 작성자");
//		
//		mapper.boardReg(bvo);
//	}
	
//	@Test
//	public void listPage() {
//		
//		mapper.boardList();
//	}
	
	@Test
	public void pageInfo() {
		
		int bno = 1;
		
		mapper.pageInfo(bno);
	}
}
