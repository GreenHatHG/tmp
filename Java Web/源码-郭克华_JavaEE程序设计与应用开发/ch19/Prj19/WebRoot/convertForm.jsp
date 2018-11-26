<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Converter"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  		<form>
			输入一个美元数量 : 
			<input type="text" name="usd"/>
			<input type="submit" value="转换"/>
		</form>
		<HR>
		<%
			String usd = request.getParameter("usd");
			if(usd!=null){
				out.println("人民币数量:" + Converter.convert(usd));
			}
		%>
  </body>
</html>
