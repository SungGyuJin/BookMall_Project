package com.springpjt.mapper;

import java.util.List;

import com.springpjt.model.BoardVO;

public interface BoardMapper {

	// 등록 C
	public void boardRegPage(BoardVO bvo);
	
	// 조회 R
	public List<BoardVO> boardListPage();
	
	// 상세조회
	public BoardVO detailPage(int bno);
	
	// 수정 U
	public int boardUpdate(BoardVO bvo);
	
	// 삭제 D
	public int boardDelete(int bno);
}
