package dao;

import idao.ICustomerDao;

public class CustomerDao implements ICustomerDao{
	public boolean getCustomerByAccount(){
		System.out.println("CustomerDao��ѯ���ݿ�");
		return true;
	}
}
