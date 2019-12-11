package com.DAO;

import com.Connection.Connection1;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Pojo.UserPOJO;
//import com.Registration.Connection1;

public class DAOImpl implements DAO_Register {

	@Override
	public boolean insert(UserPOJO user) {
		boolean status = true;
		Connection con = Connection1.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO userdata values(?,?,?,?)");
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			pst.setInt(3, user.getMobileNO());
			pst.setString(4, user.getEmail());
			int isTrue = pst.executeUpdate();
			if (isTrue == 1) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

}
