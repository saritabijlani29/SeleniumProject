package com.sample.listener;

import org.testng.IExecutionListener;

import com.sample.common.CommonFunction;

public class ExecutionListener extends CommonFunction implements IExecutionListener {

	public void onExecutionStart() {
		
	}

	public void onExecutionFinish() {
		tearDown();
	}

}
