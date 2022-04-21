package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.domain.BoardVO;

public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAOService;
	
	@Override
	public void insertBoard(BoardVO bvo) {
		
		boardDAOService.insertBoard(bvo);
		
	}
}
