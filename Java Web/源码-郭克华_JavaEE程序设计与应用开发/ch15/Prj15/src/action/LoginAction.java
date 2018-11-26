package action;
import idao.ICustomerDao;

public class LoginAction {
	private ICustomerDao icdao;	/*
	public ICustomerDao getIcdao() {
		return icdao;
	}
	public void setIcdao(ICustomerDao icdao) {
		this.icdao = icdao;
	}*/
	public LoginAction(ICustomerDao icdao){
		this.icdao = icdao;
	}
	public void execute(){		
		icdao.getCustomerByAccount();
	}	
}








/*
import idao.ICustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LoginAction {
	public void execute(){
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
		ICustomerDao icdao =(ICustomerDao)context.getBean("icdao"); 
		icdao.getCustomerByAccount();
	}	
}
*/
