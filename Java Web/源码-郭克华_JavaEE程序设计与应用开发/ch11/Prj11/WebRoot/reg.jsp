<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%> 
<html> 
	<body>
<html:form action="/reg.do">
	���������ʺ�(�ı���):<html:text property="account"></html:text><BR>
	������������(�����):
<html:password property="password"></html:password><BR>
	�������������Ϣ(�����ı���):<BR>
	<html:textarea property="info" rows="5" cols="40" value=""></html:textarea><BR>
	<html:hidden property="hiddenInfo" value="Welcome"/><BR>
	ѡ���Ա�(��ѡ��ť)��
	<html:radio property="sex" value="boy"></html:radio>��
	<html:radio property="sex" value="girl"></html:radio>Ů<BR>
	ѡ�񼮹�(�����˵�):
	<html:select property="home" value="hubei">
		<html:option value="hunan">����</html:option>
		<html:option value="hubei">����</html:option>
		<html:option value="beijing">����</html:option>
	</html:select><BR>
	ѡ�񰮺�(��ѡ��)��
	<html:multibox property="fav" value="sing"></html:multibox>����
	<html:multibox property="fav" value="dance"></html:multibox>����
	<html:multibox property="fav" value="ball"></html:multibox>����
	<html:multibox property="fav" value="swim"></html:multibox>��Ӿ<BR>
	
	<br><html:submit value="�ύע����Ϣ"></html:submit>
</html:form>

	</body>
</html>

