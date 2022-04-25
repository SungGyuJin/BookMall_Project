package com.springreg.mapper;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springreg.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void testEnroll() {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("mapper test");
//		vo.setContent("mapper test");
//		
//		mapper.enroll(vo);
//	}
	
	
	// 목록테스트
	@Test
	public void testGetList() {
		
		List<?> list = mapper.getList();
		
		list.forEach(board -> log.info("" + board));
		
	}
}
