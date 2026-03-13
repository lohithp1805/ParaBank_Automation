package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage {

 WebDriver driver;

 public AccountPage(WebDriver driver) {
  this.driver = driver;
 }

 By heading = By.xpath("//h1");
 By logout = By.linkText("Log Out");

 public boolean verifyRegistration() {

  String text = driver.findElement(heading).getText();

  if(text.contains("Welcome")) {
   System.out.println("Registration successful");
   return true;
  }

  return false;
 }

 public boolean verifyLogin() {

  String text = driver.findElement(heading).getText();

  if(text.contains("Accounts Overview")) {
   System.out.println("Login successful");
   System.out.println("Account balance page displayed");
   return true;
  }

  return false;
 }

 public void logout() {

  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  wait.until(ExpectedConditions.visibilityOfElementLocated(logout)).click();

  System.out.println("User logged out successfully");
 }
}