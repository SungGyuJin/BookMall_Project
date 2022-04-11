package com.springpjt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpjt.domain.BoardVO;
import com.springpjt.mapper.BoardMapper;
import com.springpjt.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> viewAll(){
		
		return mapper.viewAll();
	}
	
	@Override
	public BoardVO viewDetail(int seq) {
		
		return mapper.viewDetail(seq);
	}
	
	@Override
	public boolean plusCnt(int seq) {
		
		return mapper.plusCnt(seq);
	}
	
}
