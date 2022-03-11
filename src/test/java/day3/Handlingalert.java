package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//handle alert with ok
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();
		
		//handle confirm box
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		
		//handle promtbox
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.id("Textbox")).click();
		
		//read alert
		String text=driver.switchTo().alert().getText();
		if(text.contains("Please enter your name")){
			driver.switchTo().alert().sendKeys("aniket");
			driver.switchTo().alert().accept();
			
		}
		
		
		
		

	}

}
