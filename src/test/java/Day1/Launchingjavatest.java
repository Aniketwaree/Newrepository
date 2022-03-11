package Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launchingjavatest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open application
				driver.get("https://demo.guru99.com/test/newtours/");
				//click on register link
				driver.findElement(By.linkText("REGISTER")).click();
				//ENTER username as aniket
				driver.findElement(By.name("email")).sendKeys("aniket");
				//enter password
				driver.findElement(By.name("password")).sendKeys("india123");
				//enter confirm password
				driver.findElement(By.name("confirmPassword")).sendKeys("india123");
				//click on submit
				driver.findElement(By.name("submit")).click();
				
				//click on flight
				driver.findElement(By.linkText("Flights")).click();
				Thread.sleep(10000);
				
				
				//click on oneway
				driver.findElement(By.xpath("//input[@value='oneway']")).click();
				
				//select passenger value from dropdown
				Select p=new Select(driver.findElement(By.name("passCount")));
				p.selectByIndex(3);
				//p.selectByValue("4");
				//p.selectByVisibleText("4");
				
				//select from
				Select d=new Select(driver.findElement(By.name("fromPort")));
				d.selectByVisibleText("London");
				
				//select from
				Select o=new Select(driver.findElement(By.name("fromMonth")));
				o.selectByIndex(2);
				
				Select f=new Select(driver.findElement(By.name("fromDay")));
				f.selectByIndex(8);
				//select form
				Select a=new Select(driver.findElement(By.name("toPort")));
				a.selectByVisibleText("Paris");
				
				Select r=new Select(driver.findElement(By.name("toMonth")));
				r.selectByIndex(3);
				
				Select j=new Select(driver.findElement(By.name("toDay")));
				j.selectByIndex(9);
				
				
				
				//select class
				driver.findElement(By.xpath("//input[@value='First']")).click();
				
				//select airline
				Select k=new Select(driver.findElement(By.name("airline")));
				k.selectByVisibleText("Unified Airlines");
				
				driver.findElement(By.name("findFlights")).click();
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
				
				
				
				//close the browser
				
				
				driver.close();
		

	}

}
