package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://jqueryui.com/droppable/");
		
		driver.findElement(By.linkText("Droppable"));
		//for mouse and keyboard actions

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable")))
		.build()
		.perform();
		}

	}


