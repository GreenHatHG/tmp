import java.util.HashMap;
import org.hibernate.Session;

public class Query6 {
	public static void main(String[] args) {
		Session session = util.HibernateSessionFactory.getSession();
		HashMap hm = (HashMap)session.get("Student_entity", "0001");
		System.out.println("–’√˚ «:" + hm.get("stuname"));	
		util.HibernateSessionFactory.closeSession();
	}
}
