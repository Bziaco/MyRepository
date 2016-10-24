package ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Account;

public class AccountDao {
	private Connection conn;

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public int update(Account account) throws SQLException{
		String sql = "update account set abalance=? where ano=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);    //DAO를 작성할 때는 절대로 try catch를 사용하면 안된다. try catch를 사용하면 그 코드문이 절대 예외가 발생하지 않기 때문에 throws로 작업해야 된다
																 //DAO에 커넥션작업을 하는 코드가 들어가면 안된다.
		pstmt.setInt(1, account.getAbalance());
		pstmt.setString(2, account.getAno());
		int rowNo = pstmt.executeUpdate();  // 실행문
		return rowNo;
	}
	
}
