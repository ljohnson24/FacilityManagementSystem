package com.fms.model.facilityuse;

public class UserDetail implements IUserDetail {
	private String username;
	private String useraddress;
	private String useremail;
	private int userphone;

	@Override
	public String getUserName() {
		
		return username;
	}

	@Override
	public void setUserName(String username) {
		
		this.username = username;
	}

	@Override
	public String getUserAddress() {
		
		return useraddress;
	}

	@Override
	public void setUserAddress(String useraddress) {
		
		this.useraddress = useraddress;
	}

	@Override
	public String getUserEmail() {
		// TODO Auto-generated method stub
		return useremail;
	}

	@Override
	public void setUserEmail(String useremail) {
		// TODO Auto-generated method stub
		this.useremail = useremail;
	}

	@Override
	public int getUserPhone() {
		
		return userphone;
	}

	@Override
	public void setUserPhone(int userphone) {
		
		this.userphone = userphone;
	}

}
