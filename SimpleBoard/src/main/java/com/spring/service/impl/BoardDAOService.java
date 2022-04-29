package com.spring.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

@Service
public class BoardDAOService implements BoardDAO{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void insertBoard(BoardVO boardVO) {
		
		mapper.insertBoard(boardVO);
	}
	
	@Override
	public List<BoardVO> viewList(){
		
		return mapper.viewList();
	}
}
