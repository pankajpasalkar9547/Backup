package com.DAO;

import org.apache.log4j.*;

public class Student {
	
	private static final Logger LOGGER = Logger.getLogger(Student.class);
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		LOGGER.debug("This is Debug Message");
		LOGGER.info("This is Info Message");
		LOGGER.warn("This is Warning Message");
		LOGGER.fatal("This is fatal Message");
		LOGGER.error("This is error Message");
		System.out.println("Logic Executed Successfully....");
		
	}

}
