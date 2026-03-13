package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class TestListener implements ITestListener {

 @Override
 public void onTestFailure(ITestResult result) {

  try {
   ScreenshotUtils.captureScreenshot(BaseTest.driver, result.getName());
  } 
  catch (Exception e) {
   e.printStackTrace();
  }
 }

}