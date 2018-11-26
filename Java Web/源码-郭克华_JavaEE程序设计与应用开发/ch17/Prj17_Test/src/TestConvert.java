import itf.Convert;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;


public class TestConvert {

	public static void main(String[] args) throws Exception{
		String usd = "1234";
		String jndiName = "ConvertBean#itf.Convert";
		Hashtable table = new Hashtable();		
		table.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		table.put(Context.PROVIDER_URL,"t3://localhost:7001");
		//table.put(Context.SECURITY_PRINCIPAL,"weblogic");
		//table.put(Context.SECURITY_CREDENTIALS,"weblogic");
		//查询服务器中的jndiName
		Context context = new InitialContext(table);
        Convert convert = ( Convert) context.lookup(jndiName); 
        String rmb = convert.getRmb(usd);
        System.out.println("美元数:" + usd);
        System.out.println("人民币:" + rmb);
	}
}
