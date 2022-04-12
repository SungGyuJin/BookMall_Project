package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardMapper {
	
	// 전체 데이터 조회
	public List<BoardVO> infoData();
}
