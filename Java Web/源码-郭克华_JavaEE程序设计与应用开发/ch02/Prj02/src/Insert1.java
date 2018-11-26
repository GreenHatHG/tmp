import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert1 {
	public static void main(String[] args) throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = 
"INSERT INTO T_STUDENT(STUNO,STUNAME,STUSEX) VALUES('0032','冯江','男')";
		int i = stat.executeUpdate(sql);
		System.out.println("成功添加" + i + "行");
		stat.close();
		conn.close();
	}
}