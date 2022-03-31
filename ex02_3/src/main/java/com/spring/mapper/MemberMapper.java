package com.spring.mapper;

import java.util.List;

import com.spring.domain.MemberDTO;

public interface MemberMapper {
	
	public List<MemberDTO> viewAll();
	public void insertMember(MemberDTO dto);
}
