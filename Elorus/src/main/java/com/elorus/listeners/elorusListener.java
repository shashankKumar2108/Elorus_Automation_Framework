package com.elorus.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.elorus.generic.baseTest;

public class elorusListener implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String failedScriptName = result.getMethod().getMethodName();
		baseTest.actionUtil.captureScreenshot(failedScriptName);
	}
}
