
//Write an Immutable class.
package programlist;



public class ImmutableClass {

	
	public final class Employee{  
		final String ssnNumber;  
		  
		public Employee(String ssnNumber){  
		this.ssnNumber=ssnNumber;  
		}  
		  
		public String getPancardNumber(){  
		return ssnNumber;  
		}  
}
}
