package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.ExcelUtils;
import utils.ScreenshotUtils;

public class ParaBankTest extends BaseTest {

 @Test
 public void paraBankEndToEndTest() throws Exception {

  System.out.println("Browser opened and ParaBank website launched");

  String first = ExcelUtils.getCellData(1,0);
  String last = ExcelUtils.getCellData(1,1);
  String addr = ExcelUtils.getCellData(1,2);
  String city = ExcelUtils.getCellData(1,3);
  String state = ExcelUtils.getCellData(1,4);
  String zip = ExcelUtils.getCellData(1,5);
  String phone = ExcelUtils.getCellData(1,6);
  String ssn = ExcelUtils.getCellData(1,7);
  
  String username = "user" + System.currentTimeMillis();
  String password="Tesat123";
  

  RegisterPage register = new RegisterPage(driver);

  register.registerUser(first,last,addr,city,state,zip,phone,ssn,username,password);

  AccountPage account = new AccountPage(driver);

  Assert.assertTrue(account.verifyRegistration());

  account.logout();

  LoginPage login = new LoginPage(driver);

  login.login(username,password);

  Assert.assertTrue(account.verifyLogin());
  
  ScreenshotUtils.captureScreenshot(driver, "LoginSuccess");

  System.out.println("End to End test completed successfully");
 }
}