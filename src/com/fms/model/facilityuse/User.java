package com.fms.model.facilityuse;

public class User implements IUser {

	private String userid;
	private IUserDetail userdetail;
	
	@Override
	public String getUserID() {
		
		return userid;
	}

	@Override
	public void setUserID(String userid) {
		
		this.userid = userid;
	}
	
	public IUserDetail getUserDetail() {
		return userdetail;
	}
	
	public void setUserDetail(IUserDetail userdetail) {
		this.userdetail = userdetail;
	}

}
