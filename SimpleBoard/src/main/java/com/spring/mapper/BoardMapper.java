package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> viewList();
	
	public void insertBoard(BoardVO bvo);
	
	public void updateBoard(BoardVO bvo);
	
	public void deleteBOard(BoardVO bvo);
	
}
