package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sanityTest {
	
	WebDriver driver;
	
	  @Test
	  public void f() {
		  System.out.println("Running Sanity Test ..");
		  driver.get("http://computer-database.herokuapp.com/computers");
		  System.out.println("Title of the Page = " + driver.getTitle());
		  Assert.assertTrue(driver.getTitle().contains("Computers"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  	System.out.println("Before Test Run ..");
			System.setProperty("webdriver.chrome.driver",  "src/testng/resources/chromedriver");
			driver = new ChromeDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test Run ...");
		  driver.quit();
	  }

}
