package com.springreg.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springreg.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testEnroll() {
		
		BoardVO vo = new BoardVO();
		
		vo.setNickname("service");
		vo.setTitle("service test");
		vo.setContent("service test");
		
		service.enroll(vo);
		
	}
}
