package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {

	@Autowired
	private BoardService bs;
	
//	@Test
//	public void regPage() {
//
//		BoardVO bvo = new BoardVO();
//		
//		bvo.setTitle("service");
//		bvo.setContent("service");
//		bvo.setWriter("service");
//		
//		bs.boardReg(bvo);
//	}
	
	@Test
	public void pageInfo() {
		
		int bno = 1;
		
		bs.pageInfo(bno);
	}
}
