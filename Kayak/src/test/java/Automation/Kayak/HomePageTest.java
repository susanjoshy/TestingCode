package Automation.Kayak;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
	HomePage hPage;
	@BeforeClass
	public void init(){
		driver=new FirefoxDriver();
		
		hPage = new HomePage(driver);
		
	}
	@Test
	public void testTitle(){
		String expectedTitle="Search Flight,Hotels & Rental";
		hPage.openKayakHomePage();
		String actual=hPage.getTitle();
		assertEquals(actual,expectedTitle);
	}

}
