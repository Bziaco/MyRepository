package com.mycompany.myweb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.memberBoardDao;
import com.mycompany.myweb.dto.Member;

@Component
public class MemberService {
	public static final int JOIN_SUCCESS = 0;
	public static final int JOIN_FIAL = 1;
	
	public static final int LOGIN_SUCCESS = 0;
	public static final int LOGIN_FAIL_MID = 1;
	public static final int LOGIN_FAIL_MPASSWORD = 2;
	
	public static final int LOGOUT_SUCCESS = 0;
	public static final int LOGOUT_FAIL = 1;

	public static final int MODIFY_SUCCESS = 0;
	public static final int MODIFY_FAIL = 1;
	
	public static final int WITHDRAW_SUCCESS = 0;
	public static final int WITHDRAW_FIAL = 1;
	
	//insert는 1또는 예외로 값을 리턴하기 때문에
	//3가지 상태가 있다면 무조건 상수로 정의
	//성공 또는 예외처럼 2가지 경우라면 void로 처리해도 됨
	//무언가 존재하냐 안하냐는 boolean으로 처리
	
	@Autowired
	private memberBoardDao memberDao;

	public int join(Member member){
		if(member.getMid() == null){}
		memberDao.insert(member);
		return JOIN_SUCCESS;
	}
	public int login(String mid, String mpassword, HttpSession session){
		Member member = memberDao.selectByMid(mid);
		if(member == null) {return LOGIN_FAIL_MID; }
		if(member.getMpassword().equals(mpassword) == false){ return LOGIN_FAIL_MPASSWORD; }
		session.setAttribute("login", mid);
		return LOGIN_SUCCESS;
	}
	public int logout(HttpSession session){
		session.removeAttribute("login");
		return LOGOUT_SUCCESS;
	}
	public String findMPassword(String mid, String memail){
		Member member = memberDao.selectByMid(mid);
		if(member == null) return null;
		if(member.getMemail().equals(memail) == false) return null;
		return member.getMpassword();
	}
	public String findMid(String memail){
		return memberDao.selectByMemail(memail);
	}
	public Member info(String mpassword, HttpSession session){
		String mid = (String) session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword) == false) return null;
		return member;
	}
	/*public int modify(Member member){
		
	}*/
	public int withdraw(String mpassword, HttpSession session){
		String mid = (String) session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword) == false){ return WITHDRAW_FIAL; }
		memberDao.delete(mid);
		logout(session);
		return WITHDRAW_SUCCESS;
	}
	/*public boolean isMid(String mid){}*/
}
