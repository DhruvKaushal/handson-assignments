package com.hsbc.model.util;

import com.hsbc.model.dao.JdbcBackUserDao;
import com.hsbc.model.service.UserServiceImpl;

public class UserFactory {

	public static Object getInstance(String type) {
		if(type.equals("dao")) {
			return new JdbcBackUserDao();
		}
		if(type.equals("service")) {
			return new UserServiceImpl();
		}
		return null;
	}
}