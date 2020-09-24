package com.hsbc.exceptions;

public class AccountNotFoundException extends Exception{
	public AccountNotFoundException() {
		super("Account does not exist"); 
	}
	public AccountNotFoundException(String msg) {
		super(msg);
	}
}
