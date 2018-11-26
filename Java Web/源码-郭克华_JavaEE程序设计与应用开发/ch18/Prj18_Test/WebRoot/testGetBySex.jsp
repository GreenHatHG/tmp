<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="po.Student"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="dao.StudentDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
  <body>
    <%    	
    	String jndiName = "StudentDao#dao.StudentDao";
		//查询服务器中的jndiName
		InitialContext context = new InitialContext();
        StudentDao sdao = ( StudentDao) context.lookup(jndiName); 
		List list = sdao.getStudentBySex("女");
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			out.println("学号：" + stu.getStuno() + "，");
			out.println("姓名：" + stu.getStuname() + "，");
			out.println("性别：" + stu.getStusex() + "<BR>");
		}		
    %>
  </body>
</html>
