package com.healthinsurance.model;

public class PolicyData {
	private int policyId;
	private String policyName;
	private int sumInsured;
	private int companyId;
	private String companyName;
	private String location;
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public PolicyData(int policyId, String policyName, int sumInsured, int companyId, String companyName,
			String location, User user) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.sumInsured = sumInsured;
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
		this.user = user;
	}
	public PolicyData() {
		super();
	}
	
	

}
