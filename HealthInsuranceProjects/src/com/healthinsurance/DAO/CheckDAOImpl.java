package com.healthinsurance.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.healthinsurance.model.PolicyData;
import com.healthinsurance.utility.DBConnection;

public class CheckDAOImpl implements CheckDAO {

	@Override
	public List getDetails(int age, int salary) {
		String sql="SELECT policydata.policyid,policyname,suminsured,companyid,companyname,location FROM companydata inner join policydata ON policydata.policyid = companydata.policyid  where policydata.suminsured >"+salary+" and policydata.age >"+age;
		List policyDataList = new ArrayList();
		try(Connection con = DBConnection.getConnection())
		{
			 PreparedStatement pst = con.prepareStatement(sql);
			 ResultSet resultSet = pst.executeQuery();
			 while(resultSet.next())
			 {
				 PolicyData policyData = new PolicyData();
				 policyData.setPolicyId(resultSet.getInt("policyid"));
				 policyData.setPolicyName(resultSet.getString("policyname"));
				 policyData.setSumInsured(resultSet.getInt("suminsured"));
				 policyData.setCompanyId(resultSet.getInt("companyid"));
				 policyData.setCompanyName(resultSet.getString("companyname"));
				 policyData.setLocation(resultSet.getString("location"));
				 policyDataList.add(policyData);
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return policyDataList;
	}

	@Override
	public PolicyData getPolicyDetailsByCompanyId(int companyId)
	{
		String sql="SELECT policydata.policyid,policyname,suminsured,companyid,companyname,location FROM companydata inner join policydata ON policydata.policyid = companydata.policyid and companydata.companyid ="+companyId;
		PolicyData policyData = new PolicyData();
		try(Connection con = DBConnection.getConnection())
		{
			 PreparedStatement pst = con.prepareStatement(sql);
			 ResultSet resultSet = pst.executeQuery();
			 while(resultSet.next())
			 {
				 policyData.setPolicyId(resultSet.getInt("policyid"));
				 policyData.setPolicyName(resultSet.getString("policyname"));
				 policyData.setSumInsured(resultSet.getInt("suminsured"));
				 policyData.setCompanyId(resultSet.getInt("companyid"));
				 policyData.setCompanyName(resultSet.getString("companyname"));
				 policyData.setLocation(resultSet.getString("location"));
			 }
			 return policyData;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
