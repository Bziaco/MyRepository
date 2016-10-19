package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Member;

public class MemberDao {
	public void insert(Member member) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "insert into member(mid, mname, mage, mbirth)values(?,?,?,?)";  //바뀌는 데이터를 주는 구간에는 ?를 준다
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMname());
			pstmt.setInt(3, member.getMage());
			pstmt.setDate(4, new Date(member.getMbirth().getTime()));    //java.sql.Date가 필요함
			//pstmt.executeQuery() 데이터를 조회할때만 사용, select 구문일 때 사용
			int rowNo = pstmt.executeUpdate();
			if(rowNo == 1){
				System.out.println("저장 성공");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {}
		}
	}
	
	//--------------------------------------------
	
	public void update(Member member) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "update member set mage=?, mbirth=? where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMage());
			pstmt.setDate(2, new Date(member.getMbirth().getTime()));
			pstmt.setString(3, member.getMid());
			int rowNo = pstmt.executeUpdate();  //1이상의 값(1개 이상의 행이 수정됨), 0(어떤 행도 수정되지 않았음), 예외
			if(rowNo >= 1){  //1개 이상의 행이 수정될 수 있기 때문에
				System.out.println(rowNo + "행이 수정됨");
			} else if(rowNo == 0){
				System.out.println("수정된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("수정 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {}
		}
	}
	
	//------------------------------------------------------------------------
	public void deleteByMid(String mid){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			String sql = "delete member where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			int rowNo = pstmt.executeUpdate();  //1이상의 값(1개 이상의 행이 수정됨), 0(어떤 행도 수정되지 않았음), 예외
			if(rowNo >= 1){  //1개 이상의 행이 수정될 수 있기 때문에
				System.out.println(rowNo + "행이 삭제됨");
			} else if(rowNo == 0){
				System.out.println("삭제된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("삭제 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {}
		}
	}
}
