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

 public void registerUser(String user, String pass) {

  driver.findElement(firstName).sendKeys("Lohith");
  driver.findElement(lastName).sendKeys("Kumar");
  driver.findElement(address).sendKeys("Hyderabad");
  driver.findElement(city).sendKeys("Hyderabad");
  driver.findElement(state).sendKeys("Telangana");
  driver.findElement(zip).sendKeys("500001");
  driver.findElement(phone).sendKeys("9876543210");
  driver.findElement(ssn).sendKeys("123456");

  driver.findElement(username).sendKeys(user);
  driver.findElement(password).sendKeys(pass);
  driver.findElement(confirmPassword).sendKeys(pass);

  driver.findElement(registerBtn).click();
 }
}