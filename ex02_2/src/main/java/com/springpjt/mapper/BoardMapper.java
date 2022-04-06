package com.springpjt.mapper;

import com.springpjt.domain.BoardVO;

// 인터페이스는 객체를 생성할 수 없다.
public interface BoardMapper {
	
	// 게시글 상세
	public BoardVO viewDetail(int seq);
}
