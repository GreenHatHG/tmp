<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html> 
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<html:form action="/login">
			���������˺� : <html:text property="account"/><br/>
			������������ : <html:password property="password"/><br/>
			<html:submit value="��¼"/>
		</html:form>
		<HR>
		${msg}
	</body>
</html>
