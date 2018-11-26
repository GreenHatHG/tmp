import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transaction {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
			Statement stat = conn.createStatement();
			conn.setAutoCommit(false);// 设置为不要自动提交
			String sql1 = "UPDATE1";
			String sql2 = "UPDATE2";
			stat.executeUpdate(sql1);
			stat.executeUpdate(sql2);
			conn.commit(); // 提交以上操作
		} catch (Exception ex) {
			conn.rollback(); // 回退
		} finally {
			conn.close();
		}
	}
}
