package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLazy {
	public TestLazy(){
		System.out.println("TestLazy构造函数被调用");
	}
	public static void main(String[] args){
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
	}
}
