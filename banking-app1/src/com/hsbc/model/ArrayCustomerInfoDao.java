package com.hsbc.model;
import com.hsbc.dao.AccountDao;
import com.hsbc.model.Account;

public class ArrayCustomerInfoDao implements AccountDao{
	private static Account[] customers = new Account[5];
	private static int index = 0;
	@Override
	public Account store(Account account) {
		// TODO Auto-generated method stub
		customers[index++] = account;
		return account;
	}

	@Override
	public Account[] fetchAccouts() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public Account fetchAccountById(int accountNumber) {
		// TODO Auto-generated method stub
		Account cust = null;
		for(int i=0;i<index;i++) {
			if(customers[i].getCustomerId() == accountNumber) {
				cust = customers[i];
				return cust;
			}
		}
		return null;
	}

	@Override
	public Account updateAccount(int accountNumber, Account account) {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++) {
			if(customers[i].getCustomerId() == accountNumber) {
				customers[i] = account;
				break;
			}
		}
		return account;
	}
	
}
