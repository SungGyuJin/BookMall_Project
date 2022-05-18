package com.springpjt.mapper;

import java.util.List;

import com.springpjt.model.BoardVO;

public interface BoardMapper {

	// 등록 C
	public void boardRegPage(BoardVO bvo);
	
	// 조회 R
	public List<BoardVO> boardListPage();
	
	
}
