package TestNGParameter.MavenTestNG;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class EbayProductsTest {
	EbayProducts products;
	
	
	String searchKey;
	int noOfProducts;
	
	@BeforeTest
	@Parameters({"searchKey","noOfProducts"})
	public void init(String searchKey,int noOfProducts){
		this.searchKey=searchKey;
		this.noOfProducts=noOfProducts;
	
	products=new EbayProducts();
	}
	@Test
	
	public void testProduct(){
		products.productTest(searchKey, noOfProducts);
		int actual=noOfProducts;
		
		 assertEquals(5,actual);
		
		
	}
	@AfterTest
	public void tearDown(){
		products.closeDriver();
	}
	

}

