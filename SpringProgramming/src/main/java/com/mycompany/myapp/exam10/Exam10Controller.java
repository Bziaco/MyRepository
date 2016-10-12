package com.mycompany.myapp.exam10;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam10")
public class Exam10Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam10Controller.class);
	
	private G g;
	private H h;
	private Service service;
	
	//@Autowired --> Type으로 주입
	//@Resource --> 등록이름으로 주입
	
	@Autowired         //자동으로 연결시키겠다. 셋터를 호출해서 관리개체 중에서 
	public void setG(G g) {
		logger.info("setG 실행");
		this.g = g;
	}
	
	@Autowired
	public void setH(H h) {
		logger.info("setH 실행");
		this.h = h;
	}
	
	@Resource(name="serviceImpl1")
	public void setService(Service service) {
		logger.info("setService 실행");
		this.service = service;
	}
	
	@Autowired
	private I i;
	public void setI(I i){
		logger.info("setI() 실행");
		this.i = i;
	}
	private J j;
	@Autowired
	public void setJ(J j){
		logger.info("setJ() 실행");
		this.j = j;
	}
	
	@Autowired
	private K k;
	

	@RequestMapping("/index")
	public String index() {
		logger.info("setK() 실행");
		return "exam10/index";
	}
	
	@RequestMapping("/method1")
	public String method1(){
		logger.info("method1 처리");
		g.method();
		h.method();
		service.method();
		
		return "redirect:/exam10/index";
	}
	
	@RequestMapping("/method2")
	public String method2(){
		logger.info("method2 처리");
		i.method();
		j.method();
		k.method();
		return "redirect:/exam10/index";
	}
	@RequestMapping("/method3")
	public String method3(){
		logger.info("method3 처리");
		k.method();
		return "redirect:/exam10/index";
	}
}
