package mysqlexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestStaticSQLStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from Country");
			rs.last();
			System.out.println("Total Rows : " + rs.getRow());
		} catch(SQLException ex) {
			DBUtil.showErrorMessage(ex);
		}
		finally {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
		}
	}
}
