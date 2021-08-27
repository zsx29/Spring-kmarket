package kr.co.kmarket.dao;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.MemberVo;

@Repository
public interface MemberDao {

	// 로그인
	public MemberVo selectMember(String uid, String pass);
	
	// 이용약관
	public MemberVo selectTerms(MemberVo vo);
	
	// 회원가입
	public void insertMember(MemberVo vo);

	// 아이디 찾기
	public void selectSearchId(MemberVo vo);

	
	
	// 비밀번호 찾기
}
