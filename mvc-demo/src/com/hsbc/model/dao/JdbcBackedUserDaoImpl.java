package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.util.DBUtility;

public class JdbcBackedUserDaoImpl implements UserDao {

	@Override
	public User authenticate(int userId, String password) throws AuthenticationException {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			String loginQuery = "Select * from user_table where user_id=? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setPassword(resultSet.getString("password"));
				user.setSalary(resultSet.getLong("salary"));
				user.setName(resultSet.getString("name"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null ) {
				throw new AuthenticationException("Sorry username or password is incorrect");
			}
					
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} 
		return null;
	}

	@Override
	public User store(User user){
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for user_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			PreparedStatement insertStatement=connection.prepareStatement("insert into user_table values(?,?,?,?)");
			insertStatement.setInt(1,seq);
			insertStatement.setString(2,user.getName());
			insertStatement.setString(4,user.getPassword());
			insertStatement.setLong(3,user.getSalary());
			int resultSet=insertStatement.executeUpdate();
			sequenceStatement.close();
			insertStatement.close();
			connection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> allUsers=new ArrayList<User>();
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement selectStatement=connection.prepareStatement("select * from user_table");
			ResultSet resultSet=selectStatement.executeQuery();
			while(resultSet.next()) {
				User user=new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setSalary(resultSet.getLong("salary"));
				allUsers.add(user);
			}
			selectStatement.close();
			resultSet.close();
			connection.close();
		}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return allUsers;
	}

	@Override
	public User updateUser(int userId, User user) {
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement updateStatement=connection.prepareStatement("update user_table set salary=?,password=? where user_id=?");
			String salary=Long.toString(user.getSalary());
			updateStatement.setString(1,salary);
			updateStatement.setString(2,user.getPassword());
			updateStatement.setInt(3,userId);
			int resultSet=updateStatement.executeUpdate();
			updateStatement.close();
			connection.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
