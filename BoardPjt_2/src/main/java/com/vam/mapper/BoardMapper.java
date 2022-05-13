package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardMapper {
	
	// 등록
	public void reg(BoardVO board);
	
	// 조회
	public List<BoardVO> boardList();
	
	// 상세조회
	public BoardVO detailList(int bno);
	
	// 수정
	public int boardUpdate(BoardVO board);
}
