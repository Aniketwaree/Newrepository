package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//launch chrome browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					//open application
					driver.get("http://demowebshop.tricentis.com/");
					//click on register
					driver.findElement(By.linkText("Register")).click();
					//enter gender
					driver.findElement(By.id("gender-female")).click();
					//enter first name
					driver.findElement(By.name("FirstName")).sendKeys("aniket");
					//enter last name
					driver.findElement(By.name("LastName")).sendKeys("ware");
					//enter email
					driver.findElement(By.name("Email")).sendKeys("aniket123456@gmail.com");
					//enter password
					driver.findElement(By.name("Password")).sendKeys("india123");
					//enter confirm pass
					driver.findElement(By.name("ConfirmPassword")).sendKeys("india123");
					//click on reg
					driver.findElement(By.name("register-button")).click();
					//close the browser
					driver.close();
					
					
					
					
					
					
					

	}

}
