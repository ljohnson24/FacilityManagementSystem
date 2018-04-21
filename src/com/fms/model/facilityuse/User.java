package com.fms.model.facilityuse;

public class User implements IUser {

	private String userid;
	private IUserDetail userdetail;
	
	
	public User(String userid, IUserDetail userdetail) {
		this.userid = userid;
		this.userdetail = userdetail;
	}
	public String getUserID() {
		
		return userid;
	}

	
	public void setUserID(String userid) {
		
		this.userid = userid;
	}
	
	public IUserDetail getUserDetail() {
		return userdetail;
	}
	
	public void setUserDetail(IUserDetail userdetail) {
		this.userdetail = userdetail;
	}
	

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userdetail=" + userdetail + "]";
	}

}
