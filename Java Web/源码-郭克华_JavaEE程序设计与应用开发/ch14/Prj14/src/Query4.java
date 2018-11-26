import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import po.Student;

public class Query4 {
	public static void main(String[] args) {
		Session session = util.HibernateSessionFactory.getSession();		
		Criteria cri = session.createCriteria(Student.class);
		cri.add(Restrictions.eq("stusex","Ů"));
		List list = cri.list();		
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.getStuno() + " " + stu.getStuname());
		}		
		util.HibernateSessionFactory.closeSession();
	}
}
