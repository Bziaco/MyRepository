package com.mycompany.myapp.exam07;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam07")
public class Exam07Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam07Controller.class);
	
	@RequestMapping("/index")
	public String index(){
		return "exam07/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request){
		request.setAttribute("data1", "value1");  //data1의 키로 value1의 값을 저장
		request.setAttribute("data2", "value2");  //data2의 키로 value2의 값을 저장
		return "exam07/usedata";
	}
	
	@RequestMapping("/method2")
	public String method1(HttpSession session){
		session.setAttribute("data3", "value3");  //data1의 키로 value1의 값을 저장
		session.setAttribute("data4", "value4");  //data2의 키로 value2의 값을 저장
		return "exam07/usedata";
	}
	
	@RequestMapping("/method3")
	public String method3(Model model){
		model.addAttribute("data1", "value1");  //data1의 키로 value1의 값을 저장
		model.addAttribute("data2", "value2");  //data2의 키로 value2의 값을 저장
		return "exam07/usedata";
	}
	
}
