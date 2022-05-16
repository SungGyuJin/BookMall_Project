package com.boardpjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardpjt.mapper.BoardMapper;
import com.boardpjt.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;

	// 등록
	@Override
	public void boardReg(BoardVO bvo) {
		
		mapper.boardReg(bvo);
	}

	// 조회
	@Override
	public List<BoardVO> boardList() {
		
		return mapper.boardList();
	}
	
	// 수정
	@Override
	public int boardUpdate(BoardVO bvo) {
		
		return mapper.boardUpdate(bvo);
	}
	
	@Override
	public BoardVO detailList(int bno) {

		return mapper.detailList(bno);
	}
	
	// 삭제
	@Override
	public int boardDel(int bno) {
		
		return mapper.boardDel(bno);
	}
	
}
