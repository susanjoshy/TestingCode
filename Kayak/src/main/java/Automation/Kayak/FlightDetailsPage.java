package Automation.Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightDetailsPage {
	WebDriver driver;
	private static final By originText=By.xpath("//div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[1]");
	private static final By destText=By.xpath("//div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]");
	
	public FlightDetailsPage(WebDriver driver){
		this.driver=driver;
		
	}
	public String  getOrigin(){
		String origin=driver.findElement(originText).getText();
		return origin;
		}
	
	public String getDest(){
			
		String dest=driver.findElement(destText).getText();
		return dest;		
				
				
				
				
				
		}		

}
