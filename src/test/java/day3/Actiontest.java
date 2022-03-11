package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/build-your-own-computer");
		driver.findElement(By.name("q")).sendKeys("computer");
		
		//implement action concept to press down array keys for twoand press enter
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.name("q")))
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		driver.close();
		

	}

}
