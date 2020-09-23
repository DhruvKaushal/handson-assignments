package com.hsbc.utility;
//import com.hsbc.model.ArrayCustomerInfoDao;
import com.hsbc.model.AccountServiceImpl;
import com.hsbc.model.CollectionsBackedDao;

public class AccountFactory {

	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO: 
			obj = new CollectionsBackedDao();
			break;
		
		case SERVICE:
			obj = new AccountServiceImpl();
			break;
		}
		return obj;
	}
}
