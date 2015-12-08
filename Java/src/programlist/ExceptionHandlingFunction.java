/*Write a program containing a function which is expected to throw any kind of exception

say NullPointerException or ArithmeticException etc and then handle this function in the 
parent function which calls this function.
*/


package programlist;

public class ExceptionHandlingFunction {
 
			  void m(){  
			    int data=50/0;
			    System.out.println("data i s"+data);
			  }  
			  void n(){  
			    m();  
			  }  
			  void p(){  
			   try{  
			    n();  
			   }catch(ArithmeticException e){System.out.println("cant devide by 0");}  
			  }  
			  public static void main(String args[]){  
				  ExceptionHandlingFunction   obj=new ExceptionHandlingFunction();  
			   obj.p();  
			   System.out.println("normal flow...");  
			   
			  
	}

}
