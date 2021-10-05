package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {

	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {
		String expected_Username = "Michel";
		String actual_Username = "Charles";
		Assert.assertEquals(actual_Username, expected_Username);

	}

	@Test(retryAnalyzer = Retry_Class.class)
	private void password() {
		String expected_Password = "Michel12";
		String actual_Password = "Michel12";

		Assert.assertEquals(actual_Password, expected_Password);

	}

}
