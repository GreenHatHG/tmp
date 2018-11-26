package util;

import org.apache.log4j.Logger;

public class Converter {
	private static Logger logger = Logger.getLogger("Converter");
	public static String convert(String str){
		String strRmb = null;
		try{
			double rate = 6; //�˴�ģ������ݿ��ѯ�õ�
			double usd = Double.parseDouble(str);
			double rmb = usd * rate;
			strRmb = String.valueOf(rmb);
		}catch(Exception ex){
			logger.error("��������");
			return "�����ת������";
		}
		return strRmb;
	}
}

