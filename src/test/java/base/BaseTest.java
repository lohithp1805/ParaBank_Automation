package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

 protected WebDriver driver;

 @BeforeMethod
 public void setup() {

  WebDriverManager.chromedriver().setup();
  System.out.println("ChromeDriver setup completed");

  driver = new ChromeDriver();
  System.out.println("Browser launched");

  driver.manage().window().maximize();
  System.out.println("Browser window maximized");

  driver.get("https://parabank.parasoft.com/parabank/register.htm");
  System.out.println("ParaBank website opened");
 }

 @AfterMethod
 public void teardown() {

  driver.quit();
  System.out.println("Browser closed");
 }
}