package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.beans.UserContact;
import com.hsbc.model.util.DBUtility;

public class JdbcBackUserDao implements UserDao {

	@Override
	public User authenticate(int userId, String password) throws AuthenticationException {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			String loginQuery = "Select * from Persons where user_id=? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUser_Id(resultSet.getInt("ID"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getInt("phone"));
				user.setUsername(resultSet.getString("name"));
				user.setDob(resultSet.getString("dob"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null ) {
				throw new AuthenticationException("Sorry username or password is incorrect");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User store(User user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for user_ids)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			user.setUser_Id(seq);
			PreparedStatement insertStatement=connection.prepareStatement("insert into Persons values(?,?,?,?)");
			insertStatement.setInt(1,seq);
			insertStatement.setString(2,user.getUsername());
			insertStatement.setString(3,user.getPassword());
			insertStatement.setString(4,user.getDob());
			insertStatement.setInt(1,user.getPhone());
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
	public UserContact storeContact(UserContact user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for contact_ids)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			user.setUserContId(seq);
			PreparedStatement insertStatement=connection.prepareStatement("insert into contacts values(?,?,?,?)");
			insertStatement.setInt(1,seq);
			insertStatement.setInt(2,user.getUser_ref());
			insertStatement.setString(3,user.getContactName());
			insertStatement.setInt(4,user.getContactPhone());
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
	public List<UserContact> fetchAllContacts(int person_id) {
		List<UserContact> allUsers=new ArrayList<UserContact>();
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement selectStatement=connection.prepareStatement("select * from contacts where person_ref = ?");
			selectStatement.setInt(1, person_id);
			ResultSet resultSet=selectStatement.executeQuery();
			while(resultSet.next()) {
				UserContact userContact=new UserContact();
				userContact.setUserContId(resultSet.getInt("contact_id"));
				userContact.setUser_ref(resultSet.getInt("user_ref"));
				userContact.setContactName(resultSet.getString("name"));
				userContact.setContactPhone(resultSet.getInt("phone"));
				allUsers.add(userContact);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUser(int id) {
		try {
			Connection connection = DBUtility.getConnection();
			
			PreparedStatement findStatement=connection.prepareStatement("select * from contact_table where contact_id = ?");
			findStatement.setInt(1,id);
			ResultSet resultSet=findStatement.executeQuery();
			while(resultSet.next()) {
				PreparedStatement delStatement=connection.prepareStatement("delete from contact_table where contact_id = ?");
				delStatement.setInt(1,id);
				ResultSet resultSet2=delStatement.executeQuery();
				resultSet2.close();
				delStatement.close();
			}
			resultSet.close();
			findStatement.close();
			connection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public int deletePerson(int person_ref_id) {
		try {
			Connection connection = DBUtility.getConnection();
			
			PreparedStatement findStatement=connection.prepareStatement("select * from contact_table where person_ref = ?");
			findStatement.setInt(1,person_ref_id);
			ResultSet resultSet=findStatement.executeQuery();
			while(resultSet.next()) {
				PreparedStatement delStatement=connection.prepareStatement("delete from contact_table where person_ref = ?");
				delStatement.setInt(1,person_ref_id);
				ResultSet resultSet2=delStatement.executeQuery();
				resultSet2.close();
				delStatement.close();
			}
			PreparedStatement delStatement=connection.prepareStatement("delete from Persons where ID = ?");
			delStatement.setInt(1,person_ref_id);
			findStatement.executeQuery();
			resultSet.close();
			findStatement.close();
			connection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return person_ref_id;
	}

	@Override
	public User updatePassword(int userId, String password) {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			
			PreparedStatement findStatement=connection.prepareStatement("update table Persons set password = ? where ID = ?");
			findStatement.setString(1, password);
			findStatement.setInt(2,userId);
			findStatement.executeQuery();
			findStatement.close();
			connection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

}
