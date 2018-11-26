package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import action.LoginAction;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
		LoginAction loginAction =(LoginAction)context.getBean("loginAction"); 
		loginAction.execute();
	}

}
/*
import action.LoginAction;

public class Main {
	public static void main(String[] args) {
		new LoginAction().execute();
	}

}*/
