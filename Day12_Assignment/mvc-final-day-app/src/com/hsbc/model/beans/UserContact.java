package com.hsbc.model.beans;

public class UserContact {
	private int userContId;
	private int user_ref;
	private String contactName;
	private int contactPhone;
	public int getUserContId() {
		return userContId;
	}
	public void setUserContId(int userContId) {
		this.userContId = userContId;
	}
	public int getUser_ref() {
		return user_ref;
	}
	public void setUser_ref(int user_ref) {
		this.user_ref = user_ref;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public int getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(int contactPhone) {
		this.contactPhone = contactPhone;
	}
	
}
