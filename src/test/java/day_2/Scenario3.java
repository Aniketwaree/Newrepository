package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		
		//click on login
		driver.findElement(By.linkText("Log in")).click();
		
		//enter email
		driver.findElement(By.name("Email")).sendKeys("aniket123456@gmail.com");
		
		//enter password
		driver.findElement(By.name("Password")).sendKeys("india123");
		
		//click checkbox
		driver.findElement(By.id("RemberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Build your own cheap computer");
		
		
		//search type element
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.xpath("//input[@value='65']")).click();
		
		
		
		
		
		
		
		
		
		//close driver
		driver.close();
		

	}

}
