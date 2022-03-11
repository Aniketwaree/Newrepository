package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title is :"+title);
		//check title of web page equals to demo web shop
		if(title.equals("Demo web shop")){
			System.out.println("title is correct");
			
		}
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		
		//fetch html source of page 
		System.out.println(driver.getPageSource());
		
		//move back 
		driver.navigate().back();
		
		//move forward
		driver.navigate().forward();
		
		//refresh
		
		driver.navigate().refresh();
		driver.close();
		
		
		
		

	}

}
