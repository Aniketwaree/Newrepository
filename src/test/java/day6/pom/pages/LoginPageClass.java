package day6.pom.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	static WebDriver driver;
	public LoginPageClass(WebDriver driver){
		this.driver=driver;
		
	}
	
	//locators
	@FindBy(name="Email") public WebElement email;
	@FindBy(name="Password") public WebElement psd;
	@FindBy(xpath="//input[@value='Log in']") public WebElement loginbutton;
	
	//function
	public void perform_login(String un,String p){
		email.sendKeys(un);
		psd.sendKeys(p);
		loginbutton.click();
	}
public void beforeClass() throws IOException{
	fis=new FileInputStream(new File("C:\\Users\\Aniket\\Documents\\Lnt infotech\\Config.properties"));
	prop=new Properties();
	prop.load(fis);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //open apl
	 driver.get("http://demowebshop.tricentis.com/");
	 //create an object for Homepage & reg
	 hp=new HomePageClass(driver);
	 rp=new RegisterPageClass(driver);
	 lp=PageFactory.initElements(driver,LoginPageClass.class);

}
@AfterClass
public static void afterClass(){
	driver.close();
}

@Test(enabled=false)
public void RegisterTest(){
	hp.click_register();
	rp.perform_register_female("aniket","ware","aniket123456@gmail.com","india123");
	String test=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
	assertTrue(text.contains("completed"));
	driver.findElement(By.linkText("Log out")).click();

}

@Test
public void LoginTc(){
	hp.click_login();
	lp.perform_login("aniket123456@gmail.com","india123");
	//assert
}
	
}
