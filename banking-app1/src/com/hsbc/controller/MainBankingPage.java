package com.hsbc.controller;
import java.util.*;

import com.hsbc.exceptions.AccountNotFoundException;
import com.hsbc.exceptions.NotSufficientBalance;
import com.hsbc.model.Account;
import com.hsbc.service.AccountService;
import com.hsbc.utility.AccountFactory;
import com.hsbc.utility.Type;

public class MainBankingPage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService service = (AccountService) AccountFactory.getInstance(Type.SERVICE);
		int option = 0;
		do {
			System.out.println("************************Welcome to the banking system*********************************");
			System.out.println("System.out.println(\"1: Store 2: Fetch All 3: Find User by id 4: Transfer. 5: Exit\");");
			System.out.println("**************************************************************************************");
			option = sc.nextInt();
			switch(option) {
			case 1: 
				Account account = new Account();
				System.out.println("Enter customer name");
				account.setCustomerName(sc.next());
				System.out.println("Enter customer balance");
				account.setBalance(sc.nextDouble());
				Account createdAcc = service.createAccount(account);
				break;
			case 2:
				Account[] allAccounts = service.getAllAccounts();
				for(Account temp : allAccounts) {
					if(temp != null) {
						System.out.println(temp);
					}
				}
				break;
			case 3:
				System.out.println("Enter customer id you want to fetch");
				int custId = sc.nextInt();
				try {
					Account acc = service.getAccountById(custId);
					System.out.println(acc);
				} catch (AccountNotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Enter source account id");
					int sourceId = sc.nextInt();
					System.out.println("Enter destination account id");
					int destinationId = sc.nextInt();
					System.out.println("Enter amount to transfer");
					int amount = sc.nextInt();
					service.transfer(sourceId, destinationId, amount);
				} catch (AccountNotFoundException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				} catch (NotSufficientBalance e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			}
		} while(option != 5);
	}
}
