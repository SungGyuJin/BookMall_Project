package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.BoardMapper;
import com.vam.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	// 등록
	@Override
	public void reg(BoardVO board) {
		
		mapper.reg(board);
	}
	
	// 조회
	@Override
	public List<BoardVO> boardList(){
		
		return mapper.boardList();
	}
	
	// 상세조회
	@Override
	public BoardVO detailList(int bno) {
		
		return mapper.detailList(bno);
	}
	
	@Override
	public int boardUpdate(BoardVO board) {
		
		return mapper.boardUpdate(board);
	}
	
	@Override
	public int boardDelete(int bno) {
		
		return mapper.boardDelete(bno);
	}
}
