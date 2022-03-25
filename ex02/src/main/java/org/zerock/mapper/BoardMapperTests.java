package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfigurtation(class = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testPaging() {
//
//		Criteria cri = new Criteria();
//		// 10개 씩 3페이지
//		cri.setPageNum(3);
//		cri.setAmount(10);
//
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board.getBno()));
//
//	}
//
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//
//		mapper.insertSelectKey(board);
//
//		log.info(board);
//	}
//
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(5L);
//
//		log.info(board);
//	}
//
//
//	@Test
//	public void teteUpdate() {
//		BoardVO board = new BoardVO();
//
//		board.setBno(42L);
//		board.setTitle("업뎃42");
//		board.setContent("업뎃42");
//		board.setWriter("user42");
//
//		int count = mapper.update(board);
//
//		log.info("UPDATE COUNT: " + count);
//
//	}

	@Test
	public void testDelete() {
		log.info("DELETE COUNT: " + mapper.delete(682L));
	}
}