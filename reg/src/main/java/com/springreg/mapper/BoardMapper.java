package com.springreg.mapper;

import java.util.List;

import com.springreg.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> viewList();
	
	public void enroll(BoardVO board);
	
}
