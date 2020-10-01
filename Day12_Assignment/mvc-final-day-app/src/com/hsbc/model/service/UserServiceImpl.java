package com.hsbc.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.beans.UserContact;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.UserFactory;

public class UserServiceImpl implements UserService {
	private UserDao userDao = null;
	private List<User> user = new ArrayList<User>();
	
	public UserServiceImpl() {
		userDao = (UserDao) UserFactory.getInstance("dao");
	}
	@Override
	public User login(int userId, String password) throws AuthenticationException {
		User user = userDao.authenticate(userId, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public User createUser(User user) {
		User newUser=userDao.store(user);
		return newUser;
	}

	@Override
	public User updatePassword(int userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<User> fetchAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public UserContact createUserContact(UserContact user) {
		UserContact newContact=userDao.storeContact(user);
		return newContact;
	}
	//Delete contact
	@Override
	public int delUser(int id) {
		int deletedUserId = userDao.deleteUser(id);
		return deletedUserId;
	}
	@Override
	public List<User> fetchAllUsers(int personid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<UserContact> displayAllContacts(int id) {
		List<UserContact> contacts = userDao.fetchAllContacts(id);
		return contacts;
	}
	@Override
	public int deletePerson(int person_ref_id) {
		int delUser = userDao.deletePerson(person_ref_id);
		return delUser;
	}
	@Override
	public User updatePass(int userId, String password) {
		User user = userDao.updatePassword(userId, password);
		return user;
	}

}
