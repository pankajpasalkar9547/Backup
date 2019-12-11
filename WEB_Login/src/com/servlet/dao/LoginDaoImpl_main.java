package com.servlet.dao;

import com.servlet.bean.Login;

public class LoginDaoImpl_main {

	public static void main(String[] args) {
		Login login= new Login("piyu","123");
		LoginDaoImpl logindaoimpl=new LoginDaoImpl();
		
		System.out.println("validation");
		System.out.println(logindaoimpl.validate(login));
		
		
		
		
		
	}

}
