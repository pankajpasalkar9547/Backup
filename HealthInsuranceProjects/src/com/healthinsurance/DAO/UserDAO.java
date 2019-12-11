package com.healthinsurance.DAO;

import com.healthinsurance.model.User;

public interface UserDAO 
{
	public boolean addUser(User user);
	public boolean login(String username , String password);
}
