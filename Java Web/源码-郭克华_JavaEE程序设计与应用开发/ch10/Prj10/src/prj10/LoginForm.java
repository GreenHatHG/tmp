package prj10;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	private String account;
	private String password;

	public LoginForm() {
		System.out.println("LoginForm���캯��");
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		System.out.println("LoginForm setAccount");
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
