package org.TestNG;

import org.testng.annotations.Test;

public class Timout_Features {

	@Test(timeOut = 4000)
	private void login() throws Throwable {
		System.out.println("username");
		System.out.println("password");
		System.out.println("login button");

		Thread.sleep(300000);
		System.out.println("navigate to home page");

	}

}
