package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {

	public void boardReg(BoardVO bvo);

	public List<BoardVO> boardList();
	
	public BoardVO pageInfo(int bno);
	
	public int modify(BoardVO bvo);

	public int boardDel(int bno);
}
