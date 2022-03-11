package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.amazon.in/s?k=samsung+mobile&crid=2O3DXUVGXCMZK&sprefix=samsung+mobil%2Caps%2C256&ref=nb_sb_ss_ts-doa-p_2_13");
		driver.findElement(By.name("field-keywords")).sendKeys("samsung mobile");
		//implement action concept to press down array keys for twoand press enter
				Actions act=new Actions(driver);
				act.moveToElement(driver.findElement(By.name("field-keywords")))
				.pause(2000)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build().perform();
				
				driver.close();

	}

}