package org.TestNG;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 5000)
	private void login() throws Throwable {
		System.out.println("username");
		System.out.println("password");

		Thread.sleep(2000);
		System.out.println("login button");
		Thread.sleep(2000);
		System.out.println("navigate to home page");
	}

}
