package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vam.mapper.AdminMapper;
import com.vam.model.BookVO;
import com.vam.model.CateVO;
import com.vam.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	
	// 상품등록
	@Transactional
	@Override
	public void bookEnroll(BookVO book) {
		
		log.info("(service) bookEnroll");
		
		adminMapper.bookEnroll(book);
		
		if(book.getImageList() == null || book.getImageList().size() <= 0) {
			return;
		}
		
		book.getImageList().forEach(attach ->{
			
				attach.setBookId(book.getBookId());
				adminMapper.imageEnroll(attach);
		});
		
	}
	
	@Override
	public List<CateVO> cateList() {
		
		log.info("(service) cateList......");
		
		return adminMapper.cateList();
	}
	
	// 상품리스트
	@Override
	public List<BookVO> goodsGetList(Criteria cri) {
		
		log.info("goodsGetTotalList()...");
		
		return adminMapper.goodsGetList(cri);
	}

	// 상품 총 갯수
	@Override
	public int goodsGetTotal(Criteria cri) {
		
		log.info("goodsGetTotal()...");
		
		return adminMapper.goodsGetTotal(cri);
	}

	@Override
	public BookVO goodsGetDetail(int bookId) {

		log.info("(service) bookGetDetail...");
		
		return adminMapper.goodsGetDetail(bookId);
	}

	@Override
	public int goodsModify(BookVO vo) {

		log.info("goodsModify...");
		
		return adminMapper.goodsModify(vo);
	}


	@Override
	public int goodsDelete(int bookId) {
			
		log.info("goodsDelete...");
		
		return adminMapper.goodsDelete(bookId);
	}
	
	
}
