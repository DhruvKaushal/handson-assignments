package com.hsbc.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
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
		User user=null;
		List<User> allUsers=userDao.fetchAllUsers();
		for(User u:allUsers) {
			if(u.getUserId()==userId) {
				user=u;
				break;
			}
		}
		user.setPassword(password);
		User updateUser=userDao.updateUser(userId,user);
		return updateUser;
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException{
		// TODO Auto-generated method stub
		User user=null;
		List<User> allUsers=userDao.fetchAllUsers();
		for(User u:allUsers) {
			if(u.getUserId()==userId) {
				user=u;
				break;
			}
		}
		return user;
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> allUsers=userDao.fetchAllUsers();
		return allUsers;
	}

}
