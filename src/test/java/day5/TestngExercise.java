package day5;
import org.junit.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestngExercise {
	
		  @Test
		  public void Test1() {
			  System.out.println("Login TC");
		  }
		  @Test
		  public void Test2() {
			  System.out.println("search product TC");
		  }
		 
		  @BeforeMethod
		  public void beforeMethod() {
			  System.out.println("Chrome browser is launching and open appln");
		  }

		  @AfterMethod
		  public void afterMethod() {
			  System.out.println("Closing appln");
		  }

		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("chrome browser is launching and open appln-before class");
		  }

		  @AfterClass
		  public void afterClass() {
			  System.out.println("chrome browser is launching and closing appln-after class");
		  }

		  @BeforeTest
		  public void beforeTest() {
			  System.out.println("Before Test");
		  }

		  @AfterTest
		  public void afterTest() {
			  System.out.println("AfterTest");
		  }
}