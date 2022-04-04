package com.spring.mapper;

import java.util.List;

import com.spring.domain.MemberDTO;

public interface MemberMapper {
	
	
	public List<MemberDTO> viewAll(MemberDTO dto);
	// 게시물 리스트 조회
	public List<MemberDTO> selectMemberList(MemberDTO dto) throws Exception;
	
	// 게시물 등록
	public void insertMember(MemberDTO dto) throws Exception;
	
	// 게시물 수정
	public void updateMember(MemberDTO dto) throws Exception;
	
	// 게시물 삭제
	public void deleteMember(MemberDTO dto) throws Exception;
	
	// 게시물 조회
	public MemberDTO selectMemberCode(MemberDTO dto) throws Exception;
	
}
