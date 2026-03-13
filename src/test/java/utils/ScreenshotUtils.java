package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

 public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {

  File folder = new File("screenshots");
  if(!folder.exists()) {
   folder.mkdir();
  }

  TakesScreenshot ts = (TakesScreenshot) driver;
  File source = ts.getScreenshotAs(OutputType.FILE);

  String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

  File destination = new File("screenshots/" + screenshotName + "_" + timestamp + ".png");

  FileUtils.copyFile(source, destination);
 }
}