package day4;

import java.io.InterruptedIOException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JunitExercise1 {
	WebDriver driver;
	@Test
	public void Testcase1(){
		System.out.println("Test Case 1");
		
		driver.findElement(By.name("userName")).sendKeys("aniket");
		
		driver.findElement(By.name("password")).sendKeys("india123");
		
		driver.findElement(By.name("submit")).click();
		//check whether login is success
		//String actualresult = driver.findElement(By.xpath("/html/body/"))
		String actualresult = driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully']")).getText();
		Assert.assertEquals("Login Successfully", actualresult);
		
		}
	
	 @Test
	 public void Testcase2() throws InterruptedException{
		 System.out.println("flights search");
		 driver.findElement(By.name("Flights")).click();
		 Thread.sleep(5000);
		 String title=driver.getTitle();
		 Assert.assertEquals("Find a Flight: Mercury Tours:",title);
		 driver.findElement(By.xpath("//input[@value='oneway']")).click();
		 //select passenger
		 
		 
		 
		 
	 }
	 
	 @Before 
	 public void before(){
		 System.out.println("Pre-requisite");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
		 
		 
	 }
	 @After
	 public void after(){
	 System.out.println("Postcondition");
	 driver.close();
	 }

}

