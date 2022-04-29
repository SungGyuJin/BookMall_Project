package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardMapper {
	
	// 등록
	public void enroll(BoardVO board);
	
	// 조회
	public List<BoardVO> viewList();
}