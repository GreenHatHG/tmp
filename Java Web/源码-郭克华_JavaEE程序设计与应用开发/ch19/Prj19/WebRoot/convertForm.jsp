<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Converter"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  		<form>
			����һ����Ԫ���� : 
			<input type="text" name="usd"/>
			<input type="submit" value="ת��"/>
		</form>
		<HR>
		<%
			String usd = request.getParameter("usd");
			if(usd!=null){
				out.println("���������:" + Converter.convert(usd));
			}
		%>
  </body>
</html>
