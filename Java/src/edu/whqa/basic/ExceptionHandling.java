package edu.whqa.basic;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		System.out.println("a is "+a);
		try{
			int d=a/0;
			System.out.println("d is"+d);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception");
			e.printStackTrace();
		}
		
		catch(Exception e){
			System.out.println("exception");
			e.printStackTrace();
		}
		
		finally{
			System.out.println("exit\n");//closing DB,file 
		}
	}

}
