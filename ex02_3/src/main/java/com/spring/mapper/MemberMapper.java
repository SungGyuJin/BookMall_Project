package com.spring.mapper;

import java.util.List;

import com.spring.domain.MemberDTO;

public interface MemberMapper {
	
	// 조회
	public List<MemberDTO> viewMember();
	
	// 등록
	public void addMember(MemberDTO dto);
	
	// 수정
	public void editMember(MemberDTO dto);
	
	// 삭제
	public void delMember(MemberDTO dto);
	
}
