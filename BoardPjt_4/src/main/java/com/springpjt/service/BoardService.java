package com.springpjt.service;

import java.util.List;

import com.springpjt.model.BoardVO;

public interface BoardService {
	
	// 조회 R
	public List<BoardVO> boardListPage();
	
	// 등록 C
	public void boardRegPage(BoardVO bvo);
}
