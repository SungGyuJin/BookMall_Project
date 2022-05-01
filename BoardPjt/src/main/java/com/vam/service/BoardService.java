package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {
	
	// 등록
	public void enroll(BoardVO board);
	
	// 조회
	public List<BoardVO> viewList();
	
	// 상세조회
	public BoardVO getPage(int bno);
	
	// 게시판 수정
	public int modify(BoardVO board);
}
