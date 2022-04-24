package com.springreg.service;

import java.util.List;

import com.springreg.domain.BoardVO;

public interface BoardService {
	
	// 게시판 조회
	public List<BoardVO> viewList();
	
	// 게시판 등록
	public void enroll(BoardVO board);
	
}
