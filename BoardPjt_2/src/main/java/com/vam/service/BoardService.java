package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {
	
	// 등록
	public void reg(BoardVO board);

	// 조회
	public List<BoardVO> boardList();
}
