package impl;

import itf.Convert;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless (mappedName="ConvertBean")
@Remote


public class ConvertBean implements Convert {
	public ConvertBean(){
		System.out.println("ConvertBean���캯��");
	}
	public String getRmb(String usd){
		//�����ݿ��ѯ���ʣ��˴��򻯣����������6.0
		double rate = 6.0;
		double dblUsd = Double.parseDouble(usd);
		double dblRmb = dblUsd * rate;
		String rmb = String.valueOf(dblRmb);
		return rmb;
	}
}