package com.hsbc.model;

import com.hsbc.dao.AccountDao;
import com.hsbc.exceptions.AccountNotFoundException;
import com.hsbc.exceptions.NotSufficientBalance;
import com.hsbc.service.AccountService;
import com.hsbc.utility.AccountFactory;
import com.hsbc.utility.Type;

public class AccountServiceImpl implements AccountService{

	private AccountDao dao;
	
	public AccountServiceImpl() {
		dao = (AccountDao) AccountFactory.getInstance(Type.DAO);
	}
	@Override
	public Account createAccount(Account account) {
		Account acc = dao.store(account);
		// TODO Auto-generated method stub
		return acc;
	}

	@Override
	public Account getAccountById(int accountNumber) throws AccountNotFoundException{
		Account custSearch = dao.fetchAccountById(accountNumber);
		if(custSearch==null) {
			throw new AccountNotFoundException("This account does not exist");
		}
		// TODO Auto-generated method stub
		return custSearch;
	}

	@Override
	public void transfer(int from, int to, double amount) throws AccountNotFoundException, NotSufficientBalance{
		Account custFrom = dao.fetchAccountById(from);
		if(custFrom==null) {
			throw new AccountNotFoundException("This sender account does not exist");
		}
		Account custTo = dao.fetchAccountById(to);
		if(custTo==null) {
			throw new AccountNotFoundException("This sender account does not exist");
		}
		if(custTo.getBalance() < amount) {
			throw new NotSufficientBalance("No sufficient balance to transfer");
		}
		custTo.setBalance(custTo.getBalance() + amount);
		custFrom.setBalance(custFrom.getBalance() - amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account[] getAllAccounts() {
		// TODO Auto-generated method stub
		return dao.fetchAccouts();
	}
	
}
