package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardMapper {
	
	// 등록 C
	public void reg(BoardVO board);
	
	// 조회 R
	public List<BoardVO> boardList();
	
	// 수정 U
	public int boardUpdate(BoardVO board);
	
	// 삭제 D
	public int boardDelete(int bno);
	
	// 상세조회
	public BoardVO detailList(int bno);
	
}
