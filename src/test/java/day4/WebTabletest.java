package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		//fetch no of columns 
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/table/tr/th"));
		System.out.println("column size is :"+col.size());
		
		//fetch no of rows 
		//*[@id="leftcontainer"]/table/tbody/tr[1]
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("no of rows is :"+rows.size());
		
		//fetch specific data from the cell
		
		String cell = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if (cell.equals("A")) {
			
			System.out.println("data validation is success");
			
		}
		
		else {
			System.out.println("data validation is not success");}
			
			// check which company is on top
			
		String top=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
			System.out.println("top company is:"+top);
			// fetch top 5 compnay list
			for (int i=1;i<5;i++) {
				String list =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
				
	System.out.println(list);	
	
			}
		
		}


		
		

	}


