package Automation.Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class KayakFlightsPage extends KayakHomePage{
	WebDriver driver;
	private  static final By flink=By.cssSelector("#flights-link");
	
	
	
	
	private  static final By origin=By.id("origin");
	private  static final By nearByOrigin=By.cssSelector(".r9-checkbox-label");
	private  static final By dest=By.id("destination");
	private static final By nearByDest=By.cssSelector(".r9-checkbox-label");
	private static final By startDate=By.cssSelector("#travel_dates-start-display");
	private static final By returnDate=By.cssSelector("#travel_dates-end-display");
	private static final By submit=By.cssSelector("#fdimgbutton");
	private static final By originText=By.xpath("//div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[1]");
	private static final By destText=By.xpath("//div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]");
	
	
	public KayakFlightsPage(WebDriver driver){
		super(driver);
		
	}
	
	public void getFlightsPage(){

		driver.findElement(flink).click();	
		
		
	}
	public void  searchFlight(String originValue,String destValue){
		
		boolean nearbyOrigindisplayed=false;
		boolean nearbyDestDisplayed=false;
		
		driver.findElement(origin).sendKeys(originValue);
		
		nearbyOrigindisplayed=driver.findElement(nearByOrigin).isDisplayed();
		if(nearbyOrigindisplayed){
		driver.findElement(nearByOrigin).click();
		
		}
	driver.findElement(dest).sendKeys(destValue);
	nearbyDestDisplayed=driver.findElement(nearByDest).isDisplayed();
	if(nearbyDestDisplayed){
	driver.findElement(nearByDest).click();
	
	}
	driver.findElement(startDate).sendKeys("7/14/2016");
	driver.findElement(returnDate).sendKeys("7/21/16");
	
	driver.findElement(submit).click();
	
	}	
	
	public String  searchOrigin(){
	String origin=driver.findElement(originText).getText();
	return origin;
	}
	public String searchDest(){
		
	String dest=driver.findElement(destText).getText();
	return dest;		
			
			
			
			
			
	}		

}
