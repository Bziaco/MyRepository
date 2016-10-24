package ch08.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam07 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			
			//트랜잭션 작업을 시작
			conn.setAutoCommit(false);
			
			//출금작업
			String sql1 =  "update account set abalance=abalance-10000 where ano='111-111'";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			int rowNo1 = pstmt1.executeUpdate();
			pstmt1.close();
			
			//입금작업
			String sql2 =  "update account set abalance=abalance+10000 where ano='111-113'";			System.out.println("수정 실패");
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			int rowNo2 = pstmt2.executeUpdate();
			pstmt2.close();
			
			
		
			if (rowNo1 == 1 && rowNo2 == 1) { // 1개 이상의 행이 수정될 수 있기 때문에
				conn.commit();
				 System.out.println("계좌이체 성공함");
			}else {
				conn.rollback();
				System.out.println("계좌가 존재하지 않아서 계좌이제 실패함");
			}
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
			}
			System.out.println("수정 실패");
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
}
