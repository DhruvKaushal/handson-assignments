package com.hsbc.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.dao.AccountDao;

public class FileBackedDao implements AccountDao {

	private List<Account> usersList = deserialize();
	
	private void serialize(List<Account> usersList) {
		try {
			FileOutputStream fos = new FileOutputStream("users.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(usersList);
			fos.flush();
			oos.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	// it has to read a file & return all the users present in the list
	private List<Account> deserialize() {
		try {
			FileInputStream fis = new FileInputStream("users.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// this generates EOFException only if file doesn't have arrayList
			usersList = (List<Account>)ois.readObject();
			ois.close();
			fis.close();
		} catch(FileNotFoundException | EOFException e) {
			usersList = new ArrayList<Account>();
			serialize(usersList);
		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersList;
	}
	
	@Override
	public Account store(Account user) {
		this.usersList = deserialize();
		int generatedId = usersList.size()+1;
		user.setCustomerId(generatedId);
		this.usersList.add(user);
		serialize(this.usersList);
		return user;
	}

	@Override
	public Account[] fetchAccouts() {
		this.usersList = deserialize();
		Account[] userArray = new Account[usersList.size()];
		userArray = usersList.toArray(userArray);
		return userArray;
	}

	@Override
	public Account fetchAccountById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(int accountNumber, Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}