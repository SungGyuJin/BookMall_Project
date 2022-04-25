package com.springreg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreg.domain.BoardVO;
import com.springreg.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	// 목록
	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList();
	}
	
	
	// 등록
	@Override
	public void enroll(BoardVO board) {
		
		mapper.enroll(board);
		
	}

}
