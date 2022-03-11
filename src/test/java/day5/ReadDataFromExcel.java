package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;


import org.junit.*;
import org.junit.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReadDataFromExcel {
	static WebDriver driver;
	
	@Test
	public void LoginTC1() throws IOException, InterruptedException{
		//Read data frm excel
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Aniket\\Documents\\Lnt infotech\\LoginData.xlsx"));
		//access workbook - XSSWorkbook class
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//access worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		//XSSSheet sh=wb.getSheetAt(0);
		//access cell data
		/*
		 String username = sh.getRow(0).getCell(0).getStringCellValue(0);
		 
		 */
		System.out.println("no of rows is:"+sh.getPhysicalNumberOfRows());
		 for(int i=1;i<sh.getPhysicalNumberOfRows();i++){
			 String username = sh.getRow(i).getCell(0).getStringCellValue();
			 String psd = sh.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(username+"==="+psd);
			 driver.findElement(By.name("userName")).sendKeys(username);
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
