package Automation.Kayak;

import static org.testng.AssertJUnit.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class KayakHomePageTest {
	KayakHomePage hPage;
	
WebDriver driver;
	@BeforeTest
	public void init(){
		driver=new FirefoxDriver();
		driver.get("http://www.kayak.com");
		hPage = new KayakHomePage(driver);
	}
	
    @Parameters({"origin","dest"})
	@Test()
	public void testFlight(String origin,String dest){
		hPage.searchFlight(origin,dest);
		System.out.println("search successful");
	}
		@Test
		public void  testOrigin(){
			String actualOrigin="SFO";
			String expected=hPage.searchOrigin();
			assertEquals(actualOrigin,expected);
			
		}
		
		
		@Test
		public void  testDest(){
			String actualOrigin="SJC";
			String expected=hPage.searchDest();
			assertEquals(actualOrigin,expected);
			
		}
	
}
