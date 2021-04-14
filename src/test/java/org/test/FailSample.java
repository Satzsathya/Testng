package org.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer;

public class FailSample implements IAnnotationTransformer{

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = arg0.getRetryAnalyzer();
		if(retryAnalyzer==null)
		{
			arg0.setRetryAnalyzer(Failedsample2.class);
		}
	}
}
