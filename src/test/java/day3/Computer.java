package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		
		webElement computer=driver.findElement(By.xpath("//ul[@class='top-menu']/li/a"));
		

	}

}
