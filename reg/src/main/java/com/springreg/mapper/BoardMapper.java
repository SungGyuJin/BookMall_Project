package com.springreg.mapper;

import java.util.List;

import com.springreg.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void enroll(BoardVO board);
	
}
