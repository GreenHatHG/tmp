package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestInit {
	public void init(){
		System.out.println("TestInit.init");
	}
	//��������
	public void destroy(){
		//����		
	}
	public static void main(String[] args){
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
		TestInit ti =(TestInit)context.getBean("testInit"); 
	}
}
