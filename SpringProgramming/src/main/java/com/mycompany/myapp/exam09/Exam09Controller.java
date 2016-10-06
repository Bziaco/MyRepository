package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam09")
public class Exam09Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam09Controller.class);
	
	private B b;
	private A a;
	private ServiceA sa;
	private ServiceB sb;
	private ServiceC sc;
	private ServiceD sd;
	
	public void setA(A a) {
		logger.info("setA() 실행");
		this.a = a;
	}
	
	
	public void setB(B b) {
		logger.info("setB() 실행");
		this.b = b;
	}
	
	public void setSa(ServiceA sa) {
		logger.info("setSa() 실행");
		this.sa = sa;
	}
	
	public void setSb(ServiceB sb) {
		logger.info("setSb() 실행");
		this.sb = sb;
	}
	
	public void setSc(ServiceC sc) {
		logger.info("setSc() 실행");
		this.sc = sc;
	}

	public void setSd(ServiceD sd) {
		logger.info("setSd() 실행");
		this.sd = sd;
	}

	public Exam09Controller() {
		logger.info("Exam09Controller 객체 생성");
	}
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index 처리");
		return "exam09/index";
	}
	
	@RequestMapping("/method1")
	public String method1(){
		logger.info("method1 처리");
		a.method();
		b.method();
		sa.method();
		sb.method();
		sc.method();
		sd.method();
		return "redirect:/exam09/index";
	}
}
