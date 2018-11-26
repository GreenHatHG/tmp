<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%> 
<html> 
	<body>
<html:form action="/reg.do">
	请您输入帐号(文本框):<html:text property="account"></html:text><BR>
	请您输入密码(密码框):
<html:password property="password"></html:password><BR>
	请您输入个人信息(多行文本框):<BR>
	<html:textarea property="info" rows="5" cols="40" value=""></html:textarea><BR>
	<html:hidden property="hiddenInfo" value="Welcome"/><BR>
	选择性别(单选按钮)：
	<html:radio property="sex" value="boy"></html:radio>男
	<html:radio property="sex" value="girl"></html:radio>女<BR>
	选择籍贯(下拉菜单):
	<html:select property="home" value="hubei">
		<html:option value="hunan">湖南</html:option>
		<html:option value="hubei">湖北</html:option>
		<html:option value="beijing">北京</html:option>
	</html:select><BR>
	选择爱好(复选框)：
	<html:multibox property="fav" value="sing"></html:multibox>唱歌
	<html:multibox property="fav" value="dance"></html:multibox>跳舞
	<html:multibox property="fav" value="ball"></html:multibox>打球
	<html:multibox property="fav" value="swim"></html:multibox>游泳<BR>
	
	<br><html:submit value="提交注册信息"></html:submit>
</html:form>

	</body>
</html>

