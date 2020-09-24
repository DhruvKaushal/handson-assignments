package com.hsbc.utility;
//import com.hsbc.model.ArrayCustomerInfoDao;
import com.hsbc.model.AccountServiceImpl;
//import com.hsbc.model.CollectionsBackedDao;
import com.hsbc.model.FileBackedDao;

public class AccountFactory {

	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO: 
			obj = new FileBackedDao();
			break;
		
		case SERVICE:
			obj = new AccountServiceImpl();
			break;
		}
		return obj;
	}
}
