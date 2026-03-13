package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

 static ExtentReports extent;

 public static ExtentReports getReportInstance() {

  if(extent == null) {

   ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");

   extent = new ExtentReports();
   extent.attachReporter(reporter);

   extent.setSystemInfo("Project", "ParaBank Automation");
   extent.setSystemInfo("Tester", "Lohith");

  }

  return extent;
 }
}