package com.vam.mapper;

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
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void regTest() {
		
		BoardVO bvo = new BoardVO();
		
		bvo.setTitle("제목1");
		bvo.setContent("내용1");
		bvo.setWriter("작성자1");
		
		mapper.reg(bvo);
	}
	
//	@Test
//	public void detailList() {
//		
//		int bno = 1;
//		
//		log.info("" + mapper.detailList(bno));
//	}
	
	@Test
	public void del() {
		
		int bno = 5;
		
		int result = mapper.boardDelete(bno);
		
		log.info("reuslt: " + result);
		
	}
	
}
