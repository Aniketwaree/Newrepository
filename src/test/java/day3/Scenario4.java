package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//implement action concept to press down array keys for twoand press enter
		Actions act=new Actions(driver);
		webElement src=driverElement(By.xpath("//div[@id='products']/div/u1/li[2]/a"));
		webElement target=driver.findElement(By.xpath("");
		
		

	}

}
