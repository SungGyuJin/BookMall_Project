package com.springreg.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springreg.domain.BoardVO;

public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testEnroll() {
		
		BoardVO vo = new BoardVO();
		
		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		
		mapper.enroll(vo);
	}
}
