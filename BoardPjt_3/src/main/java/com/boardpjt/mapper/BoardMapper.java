package com.boardpjt.mapper;

import java.util.List;

import com.boardpjt.model.BoardVO;

public interface BoardMapper {
	
	// 등록하기 C
	public void boardReg(BoardVO bvo);
	
	// 목록보기 R
	public List<BoardVO> boardList();
	
	// 수정하기 U
	public int boardUpdate(BoardVO bvo);
	
	// 삭제하기 D
	public int boardDel(int bno);

	// 상세조회
	public BoardVO detailList(int bno);
}
