package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	
	@BeforeClass
	public static void beforeClass() throws IOException{
		//create an object for properties class
		fis=new FileInputStream(new File("C:\\Users\\Aniket\\Documents\\Lnt infotech\\Config.properties"));
		prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		//open apl
		driver.get(prop.getProperty("newtoursur1"));
		
	}
	@AfterClass
	public static void afterClass(){
		driver.close();

}
}
