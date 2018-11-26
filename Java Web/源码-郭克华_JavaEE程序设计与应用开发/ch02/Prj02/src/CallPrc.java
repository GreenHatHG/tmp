import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallPrc {
	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
		CallableStatement cs=conn.prepareCall("{call prc_getStuname(?, ?)}");
		//设置IN参数
		cs.setString(1,"0001");
		//注册OUT参数
		cs.registerOutParameter(2, java.sql.Types.CHAR);
		//执行存储过程
		cs.executeQuery();
		//获取参数值
		String result=cs.getString(2);
		cs.close();
		conn.close();
	}
}
