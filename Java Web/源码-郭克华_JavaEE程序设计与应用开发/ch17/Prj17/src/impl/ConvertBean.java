package impl;

import itf.Convert;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless (mappedName="ConvertBean")
@Remote


public class ConvertBean implements Convert {
	public ConvertBean(){
		System.out.println("ConvertBean构造函数");
	}
	public String getRmb(String usd){
		//从数据库查询汇率，此处简化，假如汇率是6.0
		double rate = 6.0;
		double dblUsd = Double.parseDouble(usd);
		double dblRmb = dblUsd * rate;
		String rmb = String.valueOf(dblRmb);
		return rmb;
	}
}