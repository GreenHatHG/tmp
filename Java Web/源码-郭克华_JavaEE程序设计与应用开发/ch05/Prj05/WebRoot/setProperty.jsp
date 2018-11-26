<%@ page language="java" import="beans.Student"
	contentType="text/html; charset=gb2312"%>
<jsp:useBean id="student" class="beans.Student"></jsp:useBean>
<jsp:setProperty property="name" name="student" param="studentName" />
<%= student.getStuname ()%>
