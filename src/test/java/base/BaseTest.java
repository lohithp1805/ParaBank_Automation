package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

 public static WebDriver driver;

 public static Logger log = LogManager.getLogger(BaseTest.class);

 @BeforeMethod
 public void setup() {

  log.info("Launching browser");

  driver = new ChromeDriver();

  driver.manage().window().maximize();

  driver.get("https://parabank.parasoft.com/parabank/register.htm");

 }

 @AfterMethod
 public void tearDown() {

  log.info("Closing browser");

  driver.quit();

 }

}