package com.spring.domain;

import java.util.List;

import org.springframework.stereotype.Component;

@Component // 이 클래스를 bean으로 관리하겠다는 의미
public interface MemberDAO {
	
	List<MemberDTO> selectMemberList(MemberDTO dto) throws Exception;
	
	void insertMember(MemberDTO dto) throws Exception;
	
	void updateMember(MemberDTO dto) throws Exception;
	
	void deleteMember(MemberDTO dto) throws Exception;
	
	MemberDTO selectMemberCode(MemberDTO dto) throws Exception;
	
}
