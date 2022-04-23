package com.springreg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreg.domain.BoardVO;
import com.springreg.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVO board) {
		
		mapper.enroll(board);
		
	}
}
