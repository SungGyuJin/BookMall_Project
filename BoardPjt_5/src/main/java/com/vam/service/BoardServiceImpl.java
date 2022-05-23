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
	
	@Override
	public void boardReg(BoardVO bvo) {
		
		mapper.boardReg(bvo);
	}

	@Override
	public List<BoardVO> boardList() {
		
		return mapper.boardList();
	}

	@Override
	public BoardVO pageInfo(int bno) {

		return mapper.pageInfo(bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		
		return mapper.modify(bvo);
	}

	@Override
	public int boardDel(int bno) {
		
		return mapper.boardDel(bno);
	}


}
