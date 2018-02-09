package com.sample.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListener implements IInvokedMethodListener  {

	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("before invocation of " + method.getTestMethod().getMethodName());
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("after invocation of " + method.getTestMethod().getMethodName());
	}


}
