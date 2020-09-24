package com.hsbc.exceptions;

public class NotSufficientBalance extends Exception{
	public NotSufficientBalance() {
		super("No sufficient balance"); 
	}
	public NotSufficientBalance(String msg) {
		super(msg);
	}
}
