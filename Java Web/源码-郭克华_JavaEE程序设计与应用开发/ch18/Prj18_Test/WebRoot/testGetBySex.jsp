<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="po.Student"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="dao.StudentDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
  <body>
    <%    	
    	String jndiName = "StudentDao#dao.StudentDao";
		//��ѯ�������е�jndiName
		InitialContext context = new InitialContext();
        StudentDao sdao = ( StudentDao) context.lookup(jndiName); 
		List list = sdao.getStudentBySex("Ů");
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			out.println("ѧ�ţ�" + stu.getStuno() + "��");
			out.println("������" + stu.getStuname() + "��");
			out.println("�Ա�" + stu.getStusex() + "<BR>");
		}		
    %>
  </body>
</html>
