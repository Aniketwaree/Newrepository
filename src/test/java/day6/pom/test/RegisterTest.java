package day6.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.RegisterPageClass;

public class RegisterTest {
	static WebDriver driver;
	FileInputStream fis;
	Properties prop;
	HomePageClass hp;
	RegisterPageClass rp;
	
	@BeforeClass
	public void beforeClass() throws IOException{
		//create an object for Properties class
		fis=new FileInputStream(new File("C:\\Users\\Aniket\\Documents\\Lnt infotech\\Config.properties"));
		prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //open apl
		 driver.get("http://demowebshop.tricentis.com/");
		 //create an object for Homepage & reg
		 hp=new HomePageClass(driver);
		 rp=new RegisterPageClass(driver);	 
	
	}
	@AfterClass
	public static void afterClass(){
		driver.close();
		}
	@Test
	public void RegisterTest(){
		hp.click_login();
		rp.perform_register_female("aniket","ware","aniket123456@gmail.com","india123");
		String test=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertTrue(text.contains("completed"));
		
	}
}
