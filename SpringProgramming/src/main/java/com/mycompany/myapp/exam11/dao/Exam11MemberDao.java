package com.mycompany.myapp.exam11.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam11.dto.Member;
import com.mycompany.myapp.exam11.service.Exam11MemberService;

@Component
public class Exam11MemberDao {
	private static final Logger logger = LoggerFactory.getLogger(Exam11MemberService.class);
	
	public void insert(Member member){
		logger.info("inset 처리");
	}
	
	public Member select(String mid){
		logger.info("select 처리");
		return null;
	}
}
