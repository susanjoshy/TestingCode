package Automation.Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	private static final String url="http://www.kayak.com";
//	private  static final By flink=By.cssSelector("#flights-link");
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		
	}
	public HomePage openKayakHomePage(){
		driver.get(url);
		return this;
		
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	

}

