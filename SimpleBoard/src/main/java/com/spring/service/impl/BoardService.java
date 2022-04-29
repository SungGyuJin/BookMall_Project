package com.spring.service.impl;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> viewList();
	
	public void insertBoard(BoardVO bvo);
	
//	public void updateBoard(BoardVO bvo);
//	
//	public void deleteBOard(BoardVO bvo);
}
