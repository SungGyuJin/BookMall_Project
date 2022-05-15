package com.boardpjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardpjt.mapper.BoardMapper;
import com.boardpjt.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public void boardReg(BoardVO bvo) {
		
		mapper.boardReg(bvo);
		
	}

	@Override
	public List<BoardVO> boardList() {
		
		return mapper.boardList();
	}
}
