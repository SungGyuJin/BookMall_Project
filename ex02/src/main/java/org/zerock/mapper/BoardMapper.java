package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	@Select("select* From tbl_board wher bno > 0")
	public List<BoardVO> getList();
}
