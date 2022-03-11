package Day2;

import org.openqa.selenium.webDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFFbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aniket\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		webDriver ffdriver=new FirefoxDriver();
		
		ffdriver.quit();
		

	}

}
