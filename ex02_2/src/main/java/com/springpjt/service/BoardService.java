package com.springpjt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springpjt.domain.BoardVO;

public interface BoardService {
	
	
	public List<BoardVO> viewAll();
	
}
