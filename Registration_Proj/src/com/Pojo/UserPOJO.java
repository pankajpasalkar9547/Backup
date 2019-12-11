package com.Pojo;

public class UserPOJO {
	private String userName;
	private String password;
	private String email;
	private int mobileNO;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(int mobileNO) {
		this.mobileNO = mobileNO;
	}
	@Override
	public String toString() {
		return "UserPOJO [userName=" + userName + ", password=" + password + ", email=" + email + ", mobileNO="
				+ mobileNO + "]";
	}
	public UserPOJO(String userName, String password, String email, int mobileNO) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNO = mobileNO;
	}
	public UserPOJO() {
		super();
	}

}
