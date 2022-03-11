package day5;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestngExercise2 {
	WebDriver driver;
	@Test
	public void LoginTC(){
		driver.manage().window().maximize();
		//enter username
        driver.findElement(By.name("userName")).sendKeys("aniket");
		
		driver.findElement(By.name("password")).sendKeys("india123");
		
		driver.findElement(By.name("submit")).click();
	}
	@Test
	public void FlightSearchTC() throws InterruptedException{
		 driver.findElement(By.linkText("Flights")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	@BeforeTest
	 public void before(){
		 System.out.println("Pre-requisite");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			
	}		
			
			 @AfterTest
			 public void after(){
			 System.out.println("Postcondition");
			 driver.close();
	
	
	

			 }
}
