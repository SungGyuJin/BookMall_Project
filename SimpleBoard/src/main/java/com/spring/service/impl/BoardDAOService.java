package com.spring.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

@Service
public class BoardDAOService implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public void insertBoard(BoardVO boardVO) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	}
}
