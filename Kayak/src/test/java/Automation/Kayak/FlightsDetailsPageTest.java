package Automation.Kayak;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class FlightsDetailsPageTest extends HomePageTest {
	FlightsSearchPage flightPage;
	
WebDriver driver;
	@BeforeClass
	public void init(){
		driver=new FirefoxDriver();
		
		hPage=new HomePage(driver);
		hPage.openKayakHomePage();
		
		
	}
	
	@BeforeMethod
	public void openFlightsPage(){
		
	
	flightPage.getFlightsPage();
	}
	
    @Parameters({"origin","dest"})
	@Test()
	public void testFlight(String origin,String dest){
    	
    	FlighDetailsPage flightDetailsPage=flightPage.searchFlight(origin,dest);
		
			String expectedOrigin=origin;
			String actualOrigin=flightDetailsPage.searchOrigin();
			assertEquals(actualOrigin,expectedOrigin);
			
		
		
		
	
			String expectedDest=dest;
			String actualDest=flightDetailsPage.searchDest();
			assertEquals(actualDest,expectedDest);
			
		}
		@AfterClass
		public void tearDown(){
			driver.close();
			
		}
		
		
		
		
		
}
	

