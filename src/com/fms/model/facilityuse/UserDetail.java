package com.fms.model.facilityuse;

public class UserDetail implements IUserDetail {

	private String username;
	private String useraddress;
	private String useremail;
	private int userphone;

	
	public UserDetail(String username, String useraddress, String useremail, int userphone) {
		this.username = username;
		this.useraddress = useraddress;
		this.useremail = useremail;
		this.userphone = userphone;
	}
	public String getUserName() {
		
		return username;
	}

	
	public void setUserName(String username) {
		
		this.username = username;
	}

	
	public String getUserAddress() {
		
		return useraddress;
	}

	
	public void setUserAddress(String useraddress) {
		
		this.useraddress = useraddress;
	}

	
	public String getUserEmail() {
		
		return useremail;
	}

	
	public void setUserEmail(String useremail) {
		
		this.useremail = useremail;
	}

	
	public int getUserPhone() {
		
		return userphone;
	}

	
	public void setUserPhone(int userphone) {
		
		this.userphone = userphone;
	}
	
	@Override
	public String toString() {
		return "UserDetail [username=" + username + ", useraddress=" + useraddress + ", useremail=" + useremail
				+ ", userphone=" + userphone + "]";
	}

}
