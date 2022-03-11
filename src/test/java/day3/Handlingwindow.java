package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		//get window id
		String oldpage=driver.getWindowHandle();
		System.out.println("curently opened page window ID is :" +oldpage);
		
		//click on click here link
		driver.findElement(By.linkText("Click Here")).click();
		//switch frm old window to new windpw
		//to gwt th window id of new tab 
		Set<String> newpage=driver.getWindowHandles();
		for(String name:newpage){
			driver.switchTo().window(name);
			System.out.println("window id of newly opened tab is :"+name);
		}
		//enter email
		driver.findElement(By.name("emailid")).sendKeys("aniket123456@gmail.com");
		
		//click submit
		driver.findElement(By.name("btnLogin")).click();
		
		//switch from newpage to old page
		driver.switchTo().window(oldpage);
		 driver.quit();
		
		
			
			
		}

	}


