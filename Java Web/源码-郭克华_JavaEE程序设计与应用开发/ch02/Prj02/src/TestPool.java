import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.sql.DataSource;
public class TestPool{
	public static void main(String args[]) throws Exception{
		//连接到Weblogic，查找DSSchool获得数据库连接
		//系统的JDK最好是Weblogic提供的，并且要将weblogic支持包放入classpath
		Hashtable table = new Hashtable();
		//放置连接的基本信息
		table.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		table.put(Context.PROVIDER_URL,"t3://localhost:7001");
		//查询服务器中的DSSchool
		Context context = new InitialContext(table);
		Object obj = context.lookup("DSSchool");
		DataSource ds = (DataSource)PortableRemoteObject.narrow(obj,DataSource.class);		
		Connection conn = ds.getConnection();	
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("SELECT STUNAME FROM T_STUDENT");
		while(rs.next()){
			System.out.println(rs.getString("STUNAME"));
		}
		rs.close();
		stat.close();
		conn.close();
		}
	}