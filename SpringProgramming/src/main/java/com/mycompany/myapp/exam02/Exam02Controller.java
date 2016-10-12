package com.mycompany.myapp.exam02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exam02")   //logger.info("/member/login") 중복을 줄여주기 위한 코드
public class Exam02Controller {
   private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);
   
   @RequestMapping("/index")   //http://localhost:8080/myapp/Member/join
   public String index() {
	   logger.info("index 요청 처리");
	   return "exam02/index";
   }
   
/*   @RequestMapping("/login")
   public String join(
		   @RequestParam("id") String mid,  //파라미터이름과 매개변수이름이 다를때 RequestParam을 줘서 매칭시켜준다
		   @RequestParam("password") String mpassword) {   //index.jsp의 join?mid=user1&mname=홍길동&mage=30 파라미타 값을 받고 콘솔에 출력
	   logger.info("login 요청 처리");
	   logger.info("mid:" + mid);
	   logger.info("mpassword:" + mpassword);
	   return "exam02/index";
   }*/
   
   @RequestMapping("/order")
   public String order(String pid, String pname, String pprice, String pcompany) {
	   logger.info("order 요청 처리");
	   logger.info("pid:" + pid);
	   logger.info("pname:" + pname);
	   logger.info("pprice:" + pprice);
	   logger.info("pcompany:" + pcompany);
	   return "exam02/index";
   }
   
   @RequestMapping("/hihi")
   public String join(Member member){
	   logger.info("join 요청 처리");
	   logger.info("mid:" + member.getMid());
	   logger.info("mname:" + member.getMname());
	   logger.info("mage:" + member.getMage());
	   return "exam02/index";
   }
   
   
   @RequestMapping("/write")
   //bno가 파라미터로 넘어와야하는데 아넘어오면 null상태가 된다. 근데 null을 int로 못바꿔 예외가 발생하니까 디폴트 1이 넘어오는 것처럼 해주는 것이 @RequestParam(defaultValue="1")
   public String writer(
		   @RequestParam(defaultValue="1") int bno,
		   String title, 
		   String content, 
		   @RequestParam(defaultValue="0") int hitcount){
	   logger.info("order 요청 처리");
	   logger.info("bno:" + bno);
	   logger.info("title:" + title);
	   logger.info("content:" + content);
	   logger.info("hitcount:" + hitcount);
	   return "/exam02/index";
   }
   
   @RequestMapping("/update")
   public String update(
		   @RequestParam(defaultValue="1") int bno,
		   String title, 
		   String content, 
		   @RequestParam(value="count", defaultValue="0") int hitcount){ //원래 @RequestParam(value="count")이건데 우리는 @RequestParam("count")줄여서 사용하고 있었음
	   logger.info("order 요청 처리");
	   logger.info("bno:" + bno);
	   logger.info("title:" + title);
	   logger.info("content:" + content);
	   logger.info("hitcount:" + hitcount);
	   return "/exam02/index";
   }
   
   @RequestMapping("/send")
   public String send(Board board){
	   logger.info("send 요청 처리");
	   logger.info("bno:" + board.getBno());
	   logger.info("title:" + board.getTitle());
	   logger.info("content:" + board.getContent());
	   logger.info("hitcount:" + board.getHitcount());
	   return "/exam02/index";
   }
}
