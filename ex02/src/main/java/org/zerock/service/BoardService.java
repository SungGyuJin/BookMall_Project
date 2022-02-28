package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);

	List<BoardVO> getList();

	boolean modify(BoardVO board);

	boolean remove(Long bno);
}
