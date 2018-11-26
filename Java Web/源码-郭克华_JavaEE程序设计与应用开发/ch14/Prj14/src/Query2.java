import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Query2 {
	public static void main(String[] args) {
		Session session = util.HibernateSessionFactory.getSession();		
		String hql = "select stuno,stuname from Student where stusex='Ů'";
		Query query = session.createQuery(hql);
		List list = query.list();
		for(int i=0;i<list.size();i++){
			Object[] objs = (Object[])list.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
		util.HibernateSessionFactory.closeSession();
	}
}
