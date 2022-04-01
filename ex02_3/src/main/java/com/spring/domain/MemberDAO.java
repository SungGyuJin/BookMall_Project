package com.spring.domain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 이 클래스를 bean으로 관리하겠다는 의미
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	public void memberInsert(MemberDTO member) {
		
		session.insert("com.spring.mapper.MemberMapper.insertMember", member);
		
	}
}
