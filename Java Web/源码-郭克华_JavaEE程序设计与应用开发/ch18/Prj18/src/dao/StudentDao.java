package dao;

import java.util.List;

import po.Student;


public interface StudentDao {
	public Student getStudentByNo(String stuno);
	public void insertStudent(String stuno,String stuname,String stusex);
	public void updateStudent(Student stu);
	public void deleteStudent(String stuno);
	public List getStudentBySex(String stusex);	
}
