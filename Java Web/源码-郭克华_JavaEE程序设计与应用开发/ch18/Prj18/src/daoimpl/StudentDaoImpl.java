package daoimpl;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import po.Student;
import dao.StudentDao;

@Stateless (mappedName="StudentDao") 
@Remote

public class StudentDaoImpl implements StudentDao {
	@PersistenceContext (unitName="school")	private EntityManager em;
	public void deleteStudent(String stuno) {
		Student stu = em.find(Student.class, stuno);
		em.remove(stu);		
	}

	public Student getStudentByNo(String stuno) {
		Student stu = em.find(Student.class, stuno);
		return stu;
	}

	public void insertStudent(String stuno,String stuname,String stusex) {
		Student stu = new Student();
		stu.setStuno(stuno);
		stu.setStuname(stuname);
		stu.setStusex(stusex);
		em.persist(stu);
	}

	public void updateStudent(Student stu) {
		System.out.println(em.contains(stu));
		em.merge(stu);		
	}

	public List getStudentBySex(String stusex) {
		Query query = em.createQuery("select stu from Student stu where stu.stusex=?1");
		query.setParameter(1, stusex);
		List list = query.getResultList();
		return list;
	}
	
}