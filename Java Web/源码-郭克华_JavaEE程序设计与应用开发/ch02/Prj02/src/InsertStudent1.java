import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent1 {
	public static void main(String[] args) throws Exception{
		String stuno = 
			javax.swing.JOptionPane.showInputDialog(null, "输入学号");
		String stuname = 
			javax.swing.JOptionPane.showInputDialog(null, "输入姓名");
		String stusex = 
			javax.swing.JOptionPane.showInputDialog(null, "输入性别");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = 
			"INSERT INTO T_STUDENT(STUNO,STUNAME,STUSEX) VALUES('" +
						stuno+"','"+stuname + "','"+stusex+"')";
		int i = stat.executeUpdate(sql);
		System.out.println("成功添加" + i + "行");
		stat.close();
		conn.close();
	}
}
