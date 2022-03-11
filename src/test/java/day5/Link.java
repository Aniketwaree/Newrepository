package day5;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Link {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://demowebshop.tricentis.com/");
		        List<WebElement> b=driver.findElements(By.tagName("a"));
		        int a=b.size();
		        System.out.println(a);
		        for(int i=1;i<a;i++)
		        {
		        	WebElement t=b.get(i);
		        	String c=t.getText();
		        	System.out.println(c);
		        	
		        }
		        driver.close();
			}
		  
		

	}


