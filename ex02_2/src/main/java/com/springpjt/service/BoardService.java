package com.springpjt.service;

import java.util.List;

import com.springpjt.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> viewAll();
	
	public BoardVO viewDetail(int seq);
	
	public boolean plusCnt(int seq);
	
}
