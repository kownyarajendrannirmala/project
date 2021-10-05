package org.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {

	int count = 1;
	int limit = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (count <= limit) {

			count++; // ---->count = count +1;
			return true; // execute

		}

		return false; // exit
	}

}
