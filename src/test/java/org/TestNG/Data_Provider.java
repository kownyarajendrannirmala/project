package org.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test
	private void credentails(String username,int password) {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);

	}
	@DataProvider
	private Object[][] test_Data() {
		return new Object [][] {
			
			{"Smith", 123}, 
			{"Starc", 345},
			{"Watson", 34566}			
			
			
		};

	}
	
	
	

}
