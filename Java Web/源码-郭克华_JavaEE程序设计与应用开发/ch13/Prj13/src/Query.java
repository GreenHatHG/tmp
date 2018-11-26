import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import po.Student;

public class Query {
	public static void main(String[] args) { 
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Student stu = (Student)session.get(Student.class, "0002");
		String stuno = stu.getStuno();
		String stuname = stu.getStuname();
		String stusex = stu.getStusex();
		System.out.println("学号:" + stuno);
		System.out.println("姓名:" + stuname);
		System.out.println("性别:" + stusex);
		//关闭session
		session.close();
	}
}
