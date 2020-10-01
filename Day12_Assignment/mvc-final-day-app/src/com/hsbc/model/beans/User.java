package com.hsbc.model.beans;

public class User {
	private String username;
	private int user_Id;
	private String password;
	private int phone;
	private String dob;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int i) {
		this.user_Id = i;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", user_Id=" + user_Id + ", password=" + password + ", phone=" + phone
				+ ", dob=" + dob + "]";
	}
	
}
