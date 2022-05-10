package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardMapper {
	
	// 등록
	public void reg(BoardVO board);
	
	// 조회
	public List<BoardVO> boardList();
}
