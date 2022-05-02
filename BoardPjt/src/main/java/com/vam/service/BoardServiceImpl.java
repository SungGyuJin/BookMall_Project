package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.BoardMapper;
import com.vam.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	// 등록
	@Override
	public void enroll(BoardVO board) {
		
		mapper.enroll(board);
	}
	
	// 조회
	@Override
	public List<BoardVO> viewList(){
		
		return mapper.viewList();
	}
	
	// 상세조회
	@Override
	public BoardVO getPage(int bno) {
		
		return mapper.getPage(bno);
	}
	
	// 수정
	@Override
	public int modify(BoardVO board) {
		
		return mapper.modify(board);
	}
	
	@Override
	public int delete(int bno) {
		
		return mapper.delete(bno);
	}
	
}
