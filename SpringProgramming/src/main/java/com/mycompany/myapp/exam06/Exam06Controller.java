package com.mycompany.myapp.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam06")
public class Exam06Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam06Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam06/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request) {  //요청 Http에 대한 모든 것을 가지고 있다. 모든것을 다 얻을 수 있다
		logger.info("method1 요청 처리");
		//클라이언트의 IP 얻기
		logger.info("WebClient IP: " + request.getRemoteAddr());
		//클라이언트의 브라우저 종류 얻기
		logger.info("WebClient 종류: " + request.getHeader("User-Agent"));  //os정보, browser의 정보 등을 알수 있다.
		if(request.getHeader("User-Agent").contains("Chrome")){
//			logger.info("브라우저 종류 : 크롬");
		} else if(request.getHeader("User-Agent").contains("Trident/7.0")){
			logger.info("브라우저 종류: 인터넷 익스플로러 11");
		}else if(request.getHeader("User-Agent").contains("MSIE")){
			logger.info("브라우저 종류: 익스플러러 10이하");
		}
		//요청 파라미터 값 얻기
		logger.info("mid: " + request.getParameter("mid"));
		logger.info("mname: " + request.getParameter("mname"));
		
		//쿼리문자열 얻기
		logger.info("쿼리 문자열: " + request.getQueryString());
		logger.info("요청 URI: " + request.getRequestURI());
		logger.info("요청 URL: " + request.getRequestURL());
		logger.info("요청 방식: " + request.getMethod());
		logger.info("시스템 파일 경로: " + request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"));
		return "exam06/index";
	}
	
	@RequestMapping("/method2")
	public void method2(HttpServletResponse response, HttpServletRequest request) throws IOException{
		/*response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("{mid:'fall',mname:'한가을'}");   //josn 형태의 데이터를 출력
		pw.flush();  //출력스트림다음에는 flush
		pw.close();*/
		
		response.setContentType("image/jpeg");
		String fileName = "사진2.jpg";
		fileName = URLEncoder.encode(fileName,"UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");  //보여주지말고 그냥 다운로드해라
		
		OutputStream os = response. getOutputStream();
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/사진2.jpg");  //동적으로 경로를 얻어줌
		InputStream is = new FileInputStream(filePath);
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = is.read(values)) != -1) {
			os.write(values, 0, byteNum);
		}
		os.flush();
		
		is.close();
		os.close();
	}
	
	@RequestMapping("/method3")
	public String method3(@RequestHeader("User-Agent") String userAgent){
		if(userAgent.contains("Chrome")){
			logger.info("브라우저 종류 : 크롬");
		} else if(userAgent.contains("Trident/7.0")){
			logger.info("브라우저 종류: 인터넷 익스플로러 11");
		}else if(userAgent.contains("MSIE")){
			logger.info("브라우저 종류: 익스플러러 10이하");
		}
		return "exam06/index";
	}
	
	@RequestMapping("/method4CreateCookie")
	public String method4CreateCookie(HttpServletResponse response) throws UnsupportedEncodingException {
		//쿠키 생성
		Cookie cookie1 = new Cookie("mid", "fall");
		String name = "홍길동";   //쿠킥값을 한글로 주면은
		name = URLEncoder.encode(name,"UTF-8");  //Encoder.encode르르 이용해 UTF-8로 변환시켜주고
		Cookie cookie2 = new Cookie("mname", name); //쿠키값으로 저장
		cookie2.setMaxAge(60);   //쿠키아 MaxAge를 1분으로 준다. 그러면 쿠키값이 1분간 H/W에 저장
		
		//쿠키 보내기(저장) - 응답 헤더에 쿠키 정보를 저장
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return "exam06/index";
	}
	
	@RequestMapping("/method4ReceiveCookieHow1")
	public String method4ReceiveCookieHow1(HttpServletRequest request) throws UnsupportedEncodingException {
		//방법1(기존방법)
		//쿠키받기 - 요청 헤더의 쿠키 정보를 읽기
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie : cookies){
				String name = cookie.getName();  //쿠키이름을 먼저 얻어낸다.
				String value = null;
				if(name.equals("mname")){  //내가 원하는 쿠키가 000이라면
					value = URLDecoder.decode(cookie.getValue(),"UTF-8");  //디코더 작업을 해준다.
				} else{
					value = cookie.getName();
				}
				System.out.println(cookie.getName() + ":" + value);
			}
		}
		return "exam06/index";
	}
	//쿠키받기 방법2
	@RequestMapping("/method4ReceiveCookieHow2")
	public String method4ReceiveCookieHow2(@CookieValue(defaultValue="", value="mid") String mid, @CookieValue(defaultValue="") String mname){
		System.out.println("mid: " + mid);
		System.out.println("mname: " + mname);
		return "exam06/index";
	}
	
	//쿠키삭제
	@RequestMapping("/method4DeleteCookie")
	public String method4DeleteCookie(HttpServletResponse response){
		Cookie cookie1 = new Cookie("mid","");
		cookie1.setMaxAge(0);   //0값을 주면 쿠키 삭제
		Cookie cookie2 = new Cookie("mname","");
		cookie2.setMaxAge(0);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "exam06/index";
	}
	
	//session 객체 생성
	@RequestMapping("/method5SetObject")
	public String method5SetObject(HttpSession session) {
		//객체 생성
		Member member = new Member("fall", "한가을");
		
		//HttpSession에 객체 저장
		session.setAttribute("member", member);   //키와 저장할 객체를 setAttribute에 저장
		return "exam06/index";
	}
	
	
	//세션 객체 얻기
	@RequestMapping("/method5GetObject")
	public String method5GetObject(HttpSession session) {
		//HttpSession에서 객체 얻기
		Member member = (Member) session.getAttribute("member");
		if(member != null){
			System.out.println("mid: " + member.getMid());
			System.out.println("mname: " + member.getMname());
		}
		return "exam06/index";
	}
	
	//쿠키삭제
	@RequestMapping("/method5RemoveObject")
	public String method5RemoveGetObject(HttpSession session) {
		session.removeAttribute("member");
		return "exam06/index";
	}
}