package org.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_1 {

	@Test
	private void Data_Verification() {
		String expected_username = "Starc";
		String actual_username = "Starc123";

		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_username, expected_username);
		System.out.println("Data Verification");
	}

}
