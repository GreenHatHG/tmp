import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallPrc {
	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		CallableStatement cs=conn.prepareCall("{call prc_getStuname(?, ?)}");
		//����IN����
		cs.setString(1,"0001");
		//ע��OUT����
		cs.registerOutParameter(2, java.sql.Types.CHAR);
		//ִ�д洢����
		cs.executeQuery();
		//��ȡ����ֵ
		String result=cs.getString(2);
		cs.close();
		conn.close();
	}
}
