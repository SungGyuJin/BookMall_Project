package com.boardpjt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boardpjt.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public List<BoardVO> testSelect() {
//		
//		return mapper.boardList();
//	}
	
	@Test
	public void testReg() {
		
		BoardVO bvo = new BoardVO();
		
		bvo.setTitle("제목");
		bvo.setContent("내용");
		bvo.setWriter("작성자");
		
		mapper.boardReg(bvo);
	}
	
	
	
}
