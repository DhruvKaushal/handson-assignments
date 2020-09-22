package com.hsbc.dao;

import com.hsbc.model.Account;

public interface AccountDao {
	public Account store(Account account);
	public Account[] fetchAccouts();
	public Account fetchAccountById(int accountNumber);
	public Account updateAccount(int accountNumber, Account account);
}