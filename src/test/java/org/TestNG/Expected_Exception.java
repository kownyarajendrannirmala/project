package org.TestNG;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		int a = 10;
		System.out.println(a / 0);

	}

}
