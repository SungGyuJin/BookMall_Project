package com.boardpjt.mapper;

import java.util.List;

import com.boardpjt.model.BoardVO;

public interface BoardMapper {
	
	// 등록하기 C
	public void boardReg(BoardVO bvo);
	
	// 목록보기 R
	public List<BoardVO> boardList();
	
	
}
