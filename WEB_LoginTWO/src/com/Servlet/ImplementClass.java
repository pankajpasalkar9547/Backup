package com.Servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImplementClass 
{
	boolean status = false;
	public boolean insertData(User user)
	{
		Connection con = ConnectionClass.getConnection();
		try 
		{
			PreparedStatement pst = con.prepareStatement("INSERT INTO userdata values(?,?,?,?)");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setInt(3, user.getMobile());
			pst.setString(4, user.getEmail());
			int isTrue = pst.executeUpdate();
			if(isTrue==1)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
}