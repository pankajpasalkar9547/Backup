package com.Servlet;

public class User 
{
	private String username;
	private String password;
	private int mobile;
	private String email;
	
	public User(){
		
	}
	public User(String username, String password, int mobile, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobile=" + mobile + ", email=" + email
				+ "]";
	}
	
	
}
