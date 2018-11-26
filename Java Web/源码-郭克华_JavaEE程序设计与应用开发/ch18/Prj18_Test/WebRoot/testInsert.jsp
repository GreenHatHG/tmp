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
    	sdao.insertStudent("0005","唐晓红","女");
    	out.println("添加成功");
    %>
  </body>
</html>
