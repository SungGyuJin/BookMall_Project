package com.spring.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.MemberDAO;
import com.spring.domain.MemberDTO;
import com.spring.mapper.MemberMapper;

@Service("MemberDAOService")
public class MemberDAOService implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberDTO> selectMemberList(MemberDTO dto) throws Exception{
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.selectMemberList(dto);
	}
	
	public void insertMember(MemberDTO dto) throws Exception{
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		mapper.insertMember(dto);
	}
	
	public void updateMember(MemberDTO dto) throws Exception {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		mapper.updateMember(dto);
	}
	
	public void deleteMember(MemberDTO dto) throws Exception{
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		mapper.deleteMember(dto);
	}
	
	public MemberDTO selectMemberCode(MemberDTO dto) throws Exception{
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.selectMemberCode(dto);
	}
}
