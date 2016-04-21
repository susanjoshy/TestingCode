package TestNGParameter.MavenTestNG;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayProducts {
	WebDriver driver;
	String url="http://www.ebay.com";
	public void init(){
		
	
	driver=new FirefoxDriver();
	driver.get(url);
	}
	public void  productTest(String searchKey,int noOfProducts){  // change to return a list 
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys(searchKey);
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
		
		List <WebElement> list=driver.findElements(By.cssSelector(".cptname>b"));
		
		int prodCount=list.size();
		//int count=driver.findElements(By.cssSelector(".listingscnt")).size();
		Iterator<WebElement> it=list.iterator();
		for(prodCount=0;prodCount<noOfProducts;prodCount++){
		while(it.hasNext()){
			System.out.println(it.next());}
		
		}
			//return list ;	
			
		}
		
		
		
	
	public void closeDriver(){
		driver.close();
	}

}
