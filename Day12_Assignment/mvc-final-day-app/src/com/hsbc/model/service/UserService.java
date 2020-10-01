package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.beans.UserContact;

public interface UserService {
	public User login(int userId, String password) throws AuthenticationException;
	public User createUser(User user);
	public UserContact createUserContact(UserContact user);
	public User updatePassword(int userId, String password);
	public User getUser(int userId) throws UserNotFoundException;
	public List<User> fetchAllUsers(int personid);
	public int delUser(int id);
	public List<UserContact> displayAllContacts(int id);
	public int deletePerson(int person_ref_id);
	public User updatePass(int userId, String password);
}