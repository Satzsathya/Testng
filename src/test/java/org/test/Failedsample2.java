package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failedsample2 implements IRetryAnalyzer{
	int min=0,max=5;

	public boolean retry(ITestResult result)
	{
		if(min < max)
		{
			min++;
			return true;
		}
		return false;
	}
}
