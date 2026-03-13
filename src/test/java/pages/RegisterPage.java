package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

 WebDriver driver;

 public RegisterPage(WebDriver driver) {
  this.driver = driver;
 }

 By firstName = By.id("customer.firstName");
 By lastName = By.id("customer.lastName");
 By address = By.id("customer.address.street");
 By city = By.id("customer.address.city");
 By state = By.id("customer.address.state");
 By zip = By.id("customer.address.zipCode");
 By phone = By.id("customer.phoneNumber");
 By ssn = By.id("customer.ssn");

 By username = By.id("customer.username");
 By password = By.id("customer.password");
 By confirmPassword = By.id("repeatedPassword");

 By registerBtn = By.xpath("//input[@value='Register']");

 public void registerUser(String first,String last,String addr,String cityName,
                          String stateName,String zipCode,String phoneNum,
                          String ssnNum,String user,String pass) {

  driver.findElement(firstName).sendKeys(first);
  driver.findElement(lastName).sendKeys(last);
  driver.findElement(address).sendKeys(addr);
  driver.findElement(city).sendKeys(cityName);
  driver.findElement(state).sendKeys(stateName);
  driver.findElement(zip).sendKeys(zipCode);
  driver.findElement(phone).sendKeys(phoneNum);
  driver.findElement(ssn).sendKeys(ssnNum);

  driver.findElement(username).sendKeys(user);
  driver.findElement(password).sendKeys(pass);
  driver.findElement(confirmPassword).sendKeys(pass);

  driver.findElement(registerBtn).click();
 }
}