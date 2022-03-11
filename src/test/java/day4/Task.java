package day4;
import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
WebDriver driver;
	
	@Test
	public void Testcase1() {
		System.out.println("Test case 1");
		//to maximise the browsser
				driver.manage().window().maximize();
			    driver.findElement(By.linkText("Register")).click();
			    driver.findElement(By.id("gender-female")).click();
			    driver.findElement(By.id("FirstName")).sendKeys("anikett");
			    driver.findElement(By.name("LastName")).sendKeys("waree");
			    driver.findElement(By.id("Email")).sendKeys("aniket1234567@gmail.com");
			    driver.findElement(By.name("Password")).sendKeys("india1234");
			    driver.findElement(By.name("ConfirmPassword")).sendKeys("india1234");
			    driver.findElement(By.id("register-button")).click();
			    String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
				Assert.assertEquals("Your registration completed",actualresult);
			    
	}
	 @Test
	public void Testcase2() throws InterruptedException {
		System.out.println("Login");
		driver.findElement(By.partialLinkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("aniket1234567@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("india1234");
	    driver.findElement(By.xpath("//input[@type='submit']/parent::div")).click();
	    
	 }
	    @Before
	public void before() {
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
	}
	@After
	public void after() {
		System.out.println("Post-Condition");
		driver.close();
}

}
