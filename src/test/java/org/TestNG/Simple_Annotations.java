package org.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setproperty() {
		System.out.println("Set Property");

	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("Browser Launch");

	}

	@BeforeClass
	private void launchurl() {
		System.out.println("URL....");

	}

	@BeforeMethod
	private void login() {
		System.out.println("Find the web element");
		System.out.println("Click the login button");
	}

	@Test(enabled = false)
	private void laptop() {
		System.out.println("Laptop");
	}

	@Ignore
	@Test
	private void mobilephones() {
		System.out.println("Mobile");
	}

	@Test
	private void earphones() {
		System.out.println("Earphone");

	}

	@Test
	private void books() {
		System.out.println("Books");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}

	@AfterClass
	private void verifyHomepage() {
		System.out.println("Home Page....");

	}

	@AfterTest
	private void close() {
		System.out.println("Driver Close");

	}

	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}

}
