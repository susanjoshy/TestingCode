package Automation.Kayak;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KayakHomePageTest {
	
	WebDriver driver;
	KayakHomePage hPage;
	@BeforeClass
	public void init(){
		driver=new FirefoxDriver();
		
		hPage = new KayakHomePage(driver);
		
	}
	@Test
	public void testTitle(){
		String expectedTitle="Search Flight,Hotels & Rental";
		hPage.openKayakHomePage();
		String actual=hPage.getTitle();
		assertEquals(actual,expectedTitle);
	}

}
