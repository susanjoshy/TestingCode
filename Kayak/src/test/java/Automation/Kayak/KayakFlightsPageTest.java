package Automation.Kayak;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class KayakFlightsPageTest extends KayakHomePageTest {
	KayakFlightsPage flightPage;
	
WebDriver driver;
	@BeforeClass
	public void init(){
		driver=new FirefoxDriver();
		
		flightPage = new KayakFlightsPage(driver);
		
	}
	
	
    @Parameters({"origin","dest"})
	@Test()
	public void testFlight(String origin,String dest){
    	
		flightPage.searchFlight(origin,dest);
		System.out.println("search successful");
	}
		@Test
		public void  testOrigin(){
			String expectedOrigin="SFO";
			String actual=flightPage.searchOrigin();
			assertEquals(actual,expectedOrigin);
			
		}
		
		//hardcoded the expected values
		@Test
		public void  testDest(){
			String expectedDest="SJC";
			String actual=flightPage.searchDest();
			assertEquals(actual,expectedDest);
			
		}
	
}
