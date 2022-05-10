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
	
	@Override
	public void reg(BoardVO board) {
		
		mapper.reg(board);
	}
	
	@Override
	public List<BoardVO> boardList(){
		
		return mapper.boardList();
	}
}
