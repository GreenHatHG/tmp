import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import po.Student;

public class Query1 {
	public static void main(String[] args) {
		Session session = util.HibernateSessionFactory.getSession();		
		String hql = "from Student where stusex='Ů'";
		Query query = session.createQuery(hql);
		List list = query.list();
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.getStuname());
		}
		util.HibernateSessionFactory.closeSession();
	}
}
