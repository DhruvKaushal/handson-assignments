package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.model.beans.User;
import com.hsbc.model.beans.UserContact;
import com.hsbc.exception.AuthenticationException;

public interface UserDao {
	public User authenticate(int userId, String password) throws AuthenticationException;
	public User store(User user);
	public List<UserContact> fetchAllContacts(int person_id);
	public User updateUser(int userId, User user);
	public UserContact storeContact(UserContact user);
	//Delete Contact
	public int deleteUser(int id);
	//public List<User> displayAllContacts(int id);
	public int deletePerson(int person_ref_id);
	public User updatePassword(int userId, String password);
}
