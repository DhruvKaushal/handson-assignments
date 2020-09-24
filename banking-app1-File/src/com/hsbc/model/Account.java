package com.hsbc.model;

import java.io.Serializable;

public class Account implements Serializable{
	private int customerId;
	private double balance;
	private String customerName;
	private static int index = 1;
	public Account(int customerId, double balance, String customerName) {
		super();
		this.customerId = index++;
		this.balance = balance;
		this.customerName = customerName;
	}
	public Account() {
		this.customerId = index++;
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", balance=" + balance + ", customerName=" + customerName + "]";
	}
	
}
