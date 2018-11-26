package util;

import org.apache.log4j.Logger;

public class Converter {
	private static Logger logger = Logger.getLogger("Converter");
	public static String convert(String str){
		String strRmb = null;
		try{
			double rate = 6; //此处模拟从数据库查询得到
			double usd = Double.parseDouble(str);
			double rmb = usd * rate;
			strRmb = String.valueOf(rmb);
		}catch(Exception ex){
			logger.error("操作错误");
			return "输入或转换有误";
		}
		return strRmb;
	}
}

