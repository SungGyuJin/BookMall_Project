package com.boardpjt.service;

import java.util.List;

import com.boardpjt.model.BoardVO;

public interface BoardService {

	// 등록하기 C
	public void boardReg(BoardVO bvo);
	
	// 목록보기 R
	public List<BoardVO> boardList();
	
	
}
