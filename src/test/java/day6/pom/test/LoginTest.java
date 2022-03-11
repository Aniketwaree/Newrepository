package day6.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class LoginTest {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	static HomePageClass hp;
	static RegisterPageClass rp;
	static LoginPageClass lp;
	
    @BeforeClass
	public void beforeClass() throws IOException {
    	fis=new FileInputStream (new File("C:\\Users\\Aniket\\Documents\\Lnt infotech\\Config.properties"));
    	prop=new Properties();
    	prop.load(fis);
    	
    	 System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
 	    driver=new ChromeDriver();
 	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 	    //open application
 	    driver.get("http://demowebshop.tricentis.com/"); 
 	    
 	    //create an object
 	    hp=new HomePageClass(driver);
 	    rp=new RegisterPageClass(driver);
 	    lp=PageFactory.initElements(driver,LoginPageClass.class);
}

    @AfterClass
    public static void afterClass() {
    	driver.close();
    	
    }

	@Test(dataProvider = "data")
	  public void LoginTest(String email, String p) {
		hp.click_login();
		lp.perform_login(email,p);
		if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
		System.out.println("login success");
		hp.click_logout();
		}else {
			System.out.println("login unsuccess");
		}
		
	}


	@DataProvider
	  public Object[][] data() {
	    return new Object[][] {
	      new Object[] { "aniket123456@gmail.com", "india123" },
	      new Object[] { "mercury", "" },
	      
	    };
	}
}


