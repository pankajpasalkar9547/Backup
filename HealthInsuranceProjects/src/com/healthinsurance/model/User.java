package com.healthinsurance.model;

public class User {
	
	private String name;
	private String address;
	private String username;
	private String password;
	private int age;
	private String gender;
	private String email;
	private String birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public User(String name, String address, String username, String password, int age, String gender, String email,
			String birthDate) {
		super();
		this.name = name;
		this.address = address;
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.birthDate = birthDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
