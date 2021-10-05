package org.TestNG;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = 2)
	private void login() {
		System.out.println("Login Button");

	}

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Browser Launch");
	}

	@Test(priority = 1)
	private void password() {
		System.out.println("Password");

	}

	@Test
	private void username() {
		System.out.println("Username");

	}

}
