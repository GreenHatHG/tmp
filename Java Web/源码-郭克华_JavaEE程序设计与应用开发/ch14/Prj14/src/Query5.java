import org.hibernate.Session;
import comppk.Student;
import comppk.StudentPK;

public class Query5 {
	public static void main(String[] args) {
		Session session = util.HibernateSessionFactory.getSession();		
		StudentPK spk = new StudentPK();
		spk.setStuno("0001");
		spk.setStuname("уехЩ");
		Student stu = (Student)session.get(Student.class, spk);
		if(stu!=null){
			System.out.println(stu.getStusex());
		}
		util.HibernateSessionFactory.closeSession();
	}
}
