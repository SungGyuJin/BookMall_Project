package com.springpjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpjt.mapper.BoardMapper;
import com.springpjt.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> boardListPage() {
		
		return mapper.boardListPage();
	}

	@Override
	public void boardRegPage(BoardVO bvo) {
		
		mapper.boardRegPage(bvo);
	}

	@Override
	public BoardVO detailPage(int bno) {

		return mapper.detailPage(bno);
	}

	@Override
	public int boardUpdate(BoardVO bvo) {
		
		return mapper.boardUpdate(bvo);
	}

	@Override
	public int boardDelete(int bno) {

		return mapper.boardDelete(bno);
	}
	
}
