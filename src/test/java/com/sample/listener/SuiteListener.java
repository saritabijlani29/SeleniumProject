package com.sample.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.sample.common.CommonFunction;

public class SuiteListener extends CommonFunction implements ISuiteListener{

	public void onStart(ISuite suite) {
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("Finish suite " + suite.getName());
		tearDown();
	}

}
