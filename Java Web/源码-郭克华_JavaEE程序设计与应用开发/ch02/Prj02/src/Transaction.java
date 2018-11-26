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
			conn.setAutoCommit(false);// ����Ϊ��Ҫ�Զ��ύ
			String sql1 = "UPDATE1";
			String sql2 = "UPDATE2";
			stat.executeUpdate(sql1);
			stat.executeUpdate(sql2);
			conn.commit(); // �ύ���ϲ���
		} catch (Exception ex) {
			conn.rollback(); // ����
		} finally {
			conn.close();
		}
	}
}
