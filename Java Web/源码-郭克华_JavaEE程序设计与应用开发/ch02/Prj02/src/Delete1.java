import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete1 {
	public static void main(String[] args) throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = "DELETE FROM T_STUDENT WHERE STUNO='0032'";
		int i = stat.executeUpdate(sql);
		System.out.println("³É¹¦É¾³ý" + i + "ÐÐ");
		stat.close();
		conn.close();
	}
}
