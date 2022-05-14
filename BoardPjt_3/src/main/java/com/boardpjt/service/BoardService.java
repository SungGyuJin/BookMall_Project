package com.boardpjt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boardpjt.model.BoardVO;

@Service
public interface BoardService {


	// 등록하기 C
	public void boardReg(BoardVO bvo);
	
	// 목록보기 R
	public List<BoardVO> boardList();
	
	
}
