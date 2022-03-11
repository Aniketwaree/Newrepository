package day5;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise2 {
	WebDriver driver;
	
	@Test
	public void TestCase1(){
		//verify whether register link is available on home pg
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
	}
	@Test
	public void TestCase2(){
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("aniket123456@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("india123");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    //verify login
	    String emailtext=driver.findElement(By.linkText("aniket123456@gmail.com")).getText();
	    assertTrue(emailtext.contains("aniket123456"));
	    assertEquals("aniket123456@gmail.com",emailtext);
	    assertTrue(driver.findElement(By.linkText("aniket123456@gmail.com")).isEnabled());
	}
	 @Before
		public void before() {
			System.out.println("Pre-requisite");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
			//open application
			driver.get("http://demowebshop.tricentis.com/");
		}
		@After
		public void after() {
			System.out.println("Post-Condition");
			
	
		
		
	}

}
