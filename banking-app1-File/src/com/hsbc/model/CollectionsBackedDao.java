package com.hsbc.model;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.dao.AccountDao;

public class CollectionsBackedDao implements AccountDao {
	public List<Account> customerInfo = new ArrayList<Account>();
	@Override
	public Account store(Account account) {
		// TODO Auto-generated method stub
		customerInfo.add(account);
		return null;
	}

	@Override
	public Account[] fetchAccouts() {
		Account[] account = customerInfo.toArray(new Account[customerInfo.size()]);  
		// TODO Auto-generated method stub
		return account;
	}

	@Override
	public Account fetchAccountById(int accountNumber) {
		// TODO Auto-generated method stub
		for(int i=0;i<customerInfo.size();i++) {
			if(customerInfo.get(i).getCustomerId()==accountNumber) {
				return customerInfo.get(i);
			}
		}
		return null;
	}

	@Override
	public Account updateAccount(int accountNumber, Account account) {
		// TODO Auto-generated method stub
		for(int i=0;i<customerInfo.size();i++) {
			if(customerInfo.get(i).getCustomerId()==accountNumber) {
				customerInfo.set(i, account);
			}
		}
		return account;
	}

}
