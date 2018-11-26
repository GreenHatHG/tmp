import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select1 {
	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = 
"SELECT STUNO,STUNAME FROM T_STUDENT WHERE STUSEX='Ů'";
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			String stuno = rs.getString("STUNO");
			String stuname = rs.getString("STUNAME");
			System.out.println(stuno + "  " + stuname);
		}
		stat.close();
		conn.close();
	}
}
