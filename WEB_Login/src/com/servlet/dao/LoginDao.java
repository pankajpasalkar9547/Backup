package com.servlet.dao;

import com.servlet.bean.Login;

public interface LoginDao {
	
	boolean validate(Login login);
}