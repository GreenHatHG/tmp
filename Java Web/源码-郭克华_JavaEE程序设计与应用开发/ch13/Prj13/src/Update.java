import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import po.Student;

public class Update {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Student stu = (Student) session.get(Student.class, "0002");
		if (stu != null) {
			stu.setStusex("ÄÐ");
			// ÐÞ¸Ä
			Transaction tran = session.beginTransaction();
			session.update(stu);
			tran.commit();
		}		
		// ¹Ø±Õsession
		session.close();
	}
}
