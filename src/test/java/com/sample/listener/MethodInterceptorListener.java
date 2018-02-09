package com.sample.listener;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

@SuppressWarnings("all") 
public class MethodInterceptorListener implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext arg1) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		for (IMethodInstance m : methods) {
		}

		return result;
	}

}
