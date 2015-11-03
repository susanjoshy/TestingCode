package edu.whqa.basic;

public class ThrowsExample {
	public static void checkAge(int age) throws 
	 CustomException
	{
		if(age<18){
			throw new CustomException("Inavlid age");	
			
		}
		else
		{
			System.out.println("age is in the range");
		}
	}
	
public static void main(String[] args) {
	try{
	ThrowsExample.checkAge(17);
	
	}
	
	catch(CustomException e){
		System.out.println("Error/ Exception");

		}
}

}


