import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import po.Student;

public class Insert {
	public static void main(String[] args) { 
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Student stu = new Student();
		stu.setStuno("0012");
		stu.setStuname("»ÆÔÆÉ½");
		stu.setStusex("ÄÐ");
		//±£´æ
		Transaction tran = session.beginTransaction();
		session.save(stu);
		tran.commit();
		//¹Ø±Õsession
		session.close();
	}
}
