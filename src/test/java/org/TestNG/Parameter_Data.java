package org.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Data {
	
	@Test
	@Parameters({"username","password"})
	private void credentails(String username, String password) {
		System.out.println("username : "+username);
		System.out.println(("password: "+password));
		
	}
	
	}
	
	
	
	
	
	
	


