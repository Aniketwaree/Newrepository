package day6;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
    ExtentSparkReporter htmlreportloc;
    ExtentReports report;
    WebDriver driver;
    ExtentTest test;
  @Test
  public void LoginTC() {
      test=report.createTest("Login TC");
      driver.findElement(By.name("userName")).sendKeys("aniket");
      driver.findElement(By.name("password")).sendKeys("aniket123456@gmail.com");
      driver.findElement(By.name("submit")).click();
      if(driver.getTitle().contains("login")){
          test.log(Status.PASS, "Login Success");

      }else{
          test.log(Status.FAIL, "Login Unsucess");
      }
  }
  @BeforeTest
  public void beforeTest() {
      //define html localtion using ExtentSparkReporter class
      htmlreportloc=new ExtentSparkReporter("C:\\Users\\Aniket\\Documents\\Lnt infotech.html");
      //create ExtentReports class
      report=new ExtentReports();
      report.attachReporter(htmlreportloc);
      //to beautfy the report
      htmlreportloc.config().setTheme(Theme.DARK);

      //launching an appln
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //open applicdation
            driver.get("https://demo.guru99.com/test/newtours/");

  }
 
  @AfterTest
  public void afterTest() {
      report.flush(); //generates report
      driver.close();
  }
 
}

