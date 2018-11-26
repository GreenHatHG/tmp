import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update1 {
	public static void main(String[] args) throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = 
"UPDATE T_STUDENT SET STUSEX='女' WHERE STUNO='0002'";
		int i = stat.executeUpdate(sql);
		System.out.println("成功修改" + i + "行");
		stat.close();
		conn.close();
	}
}
