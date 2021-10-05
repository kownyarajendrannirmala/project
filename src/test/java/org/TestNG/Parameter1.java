package org.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	@Test
	@Parameters({ "username", "password" })
	private void credentails(@Optional("Starc") String username, String password) {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
	}

}
