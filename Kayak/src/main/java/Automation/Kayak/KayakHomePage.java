package Automation.Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KayakHomePage {
	
	WebDriver driver;
	private static final String url="http://www.kayak.com";
	private  static final By flink=By.cssSelector("#flights-link");
	
	public KayakHomePage(WebDriver driver){
		this.driver=driver;
		
	}
	public KayakHomePage openKayakHomePage(){
		driver.get(url);
		return this;
		
	}
	public String getTitle(){
		return driver.getTitle();
	}
	/*public KayakFlightsPage clickFlight(){
		
		driver.findElement(flink).click();
	return new KayakFlightsPage(driver);*/

}

