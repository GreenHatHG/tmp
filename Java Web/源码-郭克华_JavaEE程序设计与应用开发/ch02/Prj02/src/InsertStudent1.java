import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent1 {
	public static void main(String[] args) throws Exception{
		String stuno = 
			javax.swing.JOptionPane.showInputDialog(null, "����ѧ��");
		String stuname = 
			javax.swing.JOptionPane.showInputDialog(null, "��������");
		String stusex = 
			javax.swing.JOptionPane.showInputDialog(null, "�����Ա�");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = 
			"INSERT INTO T_STUDENT(STUNO,STUNAME,STUSEX) VALUES('" +
						stuno+"','"+stuname + "','"+stusex+"')";
		int i = stat.executeUpdate(sql);
		System.out.println("�ɹ����" + i + "��");
		stat.close();
		conn.close();
	}
}
