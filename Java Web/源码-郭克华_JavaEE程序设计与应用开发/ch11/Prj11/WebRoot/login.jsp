<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html> 
	<body>
		<html:form action="/login">
			Please input your account: <html:text property="account"/><br/>
			Please input your password£º<html:password property="password"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>
