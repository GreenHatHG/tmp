import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertStudent2 {
	public static void main(String[] args) throws Exception {
		String stuno = 
			javax.swing.JOptionPane.showInputDialog(null, "����ѧ��");
		String stuname = 
			javax.swing.JOptionPane.showInputDialog(null, "��������");
		String stusex = 
			javax.swing.JOptionPane.showInputDialog(null, "�����Ա�");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		Statement stat = conn.createStatement();
		String sql = "INSERT INTO T_STUDENT(STUNO,STUNAME,STUSEX) VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, stuno);
		ps.setString(2, stuname);
		ps.setString(3, stusex);
		int i = ps.executeUpdate();
		System.out.println("�ɹ����" + i + "��");
		ps.close();
		conn.close();
	}
}
