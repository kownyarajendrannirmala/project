package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	private void Data_Validation() {

		String expected_username = "Starc";
		String actual_username = "Starc123";

		Assert.assertEquals(actual_username, expected_username);

		
		System.out.println("Data Validation");
	}

}
