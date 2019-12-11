package com.servlet.dao;



public class LoginDaoImpl_main {

	public static void main(String[] args) {
		Login login= new Login("purva","123");
		LoginDaoImpl logindaoimpl=new LoginDaoImpl();
		
		System.out.println("validation");
		System.out.println(logindaoimpl.validate(login));
		
		
		
		
		
	}

}
