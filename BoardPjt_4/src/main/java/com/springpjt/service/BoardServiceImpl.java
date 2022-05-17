package com.springpjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpjt.mapper.BoardMapper;
import com.springpjt.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> boardListPage() {
		
		return mapper.boardListPage();
	}
	
}
