package com.hsbc.service;

import com.hsbc.exceptions.*;
import com.hsbc.model.Account;

public interface AccountService {
	public Account createAccount(Account account); 
	public Account getAccountById(int accountNumber) throws AccountNotFoundException;
	// use throws InsufficientBalanceException, AccountNotFoundException
	public void transfer(int from, int to, double amount) throws AccountNotFoundException, NotSufficientBalance;
	public Account[] getAllAccounts();

}