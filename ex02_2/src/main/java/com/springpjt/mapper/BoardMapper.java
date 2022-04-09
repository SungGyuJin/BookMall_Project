package com.springpjt.mapper;

import java.util.List;

import com.springpjt.domain.BoardVO;

// 인터페이스는 객체를 생성할 수 없다.
public interface BoardMapper {
	
	// 게시글
	public List<BoardVO> viewAll();
}
