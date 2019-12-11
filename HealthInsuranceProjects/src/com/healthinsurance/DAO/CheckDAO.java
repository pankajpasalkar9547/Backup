package com.healthinsurance.DAO;

import java.util.List;

import com.healthinsurance.model.PolicyData;

public interface CheckDAO {
	public List getDetails(int age,int salary);
	public PolicyData getPolicyDetailsByCompanyId(int companyId);

}
