package com.mycompany.myapp.exam05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	   private static final Logger logger = LoggerFactory.getLogger(Exam05Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam05/index";
	}
	
	@RequestMapping("/index2")
	public ModelAndView index2() {
		logger.info("index2 요청 처리");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("exam05/index");
		return mav;
	}
	
	@RequestMapping("/index3")
	public void index3(HttpServletRequest request, HttpServletResponse response) throws IOException {  //HttpServletResponse를 사용하는 방법은 HttpServletResponse response객체를 매개변수로 넣어주면 된다   
		logger.info("index3 요청 처리");
		response.setContentType("image/jpeg");  //이미지를 보내는 타입

		//HttpServletResponse response을 이용해 응답내용을 만들어낸것
		// OutputStream os = response.getOutputStream(); //그림이든 문자든 여러개를 다 출력할때
		// 사용
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg");
		InputStream is = new FileInputStream(filePath); //그림을 입력스트림으로 받아서 절대경로추가
		OutputStream os = response.getOutputStream();  //그림출력 스트림
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = is.read(values)) != -1) {
			os.write(values, 0, byteNum);
		}
		os.flush();
		is.close();
		

	}
}
