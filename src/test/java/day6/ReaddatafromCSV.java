package day6;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReaddatafromCSV {
	static WebDriver driver;
		@Test
		public void LoginTC() throws IOException,CsvException{
		//locate my csv file 
		CSVReader csvReader=new CSVReader(new FileReader("C:\\Users\\Aniket\\Documents\\Lnt infotech\\LoginData.csv"));
		
		String[] csvCell;
		//read all cell data
		while((csvCell=csvReader.readNext())!=null){
			String un=csvCell[0];
			String psd=csvCell[1];
			 System.out.println(un+"---"+psd);
			 driver.findElement(By.name("userName")).sendKeys(un);
			 driver.findElement(By.name("password")).sendKeys(psd);
		     driver.findElement(By.name("submit")).click();
		     if(driver.getTitle().contains("Login")){
		    	 System.out.println("valid credentials");
		    	 driver.findElement(By.linkText("SIGN-OFF")).click();
		     }else{
		    	 System.out.println("Invalid credentials");
		    	 
		    	 
		    	 
		     }
			 
		 }
		
	}
	
	@BeforeClass
   public static void beforeClass(){
   	//launch chrome
   	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		

}
	@AfterClass
	public static void afterClass(){
		driver.close();
		
	}


			
		}
	


