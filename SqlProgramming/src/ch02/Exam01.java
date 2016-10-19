package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//어떤 JDBC Driver를 사용할 것인가(JDBC Driver 로딩)
		Class.forName("oracle.jdbc.OracleDriver");   //다른 db를 쓸때 달라지는 코드 부분
		
		//연결 요청을 해서 연결 객체를 얻기
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl", //다른 db를 쓸때 달라지는 코드 부분
			"tester1", "kosa12345");
		
		//SQL문을 보내고 실행시킴
		String sql ="select empno,ename from emp";
		PreparedStatement pstmt = conn.prepareStatement(sql); //실행할 준비가 완료되면 객체가 얻어진다.
		ResultSet rs = pstmt.executeQuery();  //결과값을 리턴함
		
		//결과셋에서 한 행씩 읽기
		while(rs.next()){  //디비테이블을 한 커서를 내리는 작업을 하는 것이 next();
			                 //커서 이동후 데이터가 잇으면 true리턴 없으면 false;
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			System.out.println(empno + ":" + ename);
		}
		
		//JDBC 관련 객체 닫기(메모리 리소스 해제)
		rs.close();
		pstmt.close();
		conn.close();
	}
}
