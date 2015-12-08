/*Write a program that is expected to throw a null pointer exception and in turn handles it using 

try catch and finally.*/


package programlist;



public class ExceptionHandling {

	public static void main(String[] args) {
		Object obj=null;
		
		
		String str=null;
		try{
		System.out.println("String is "+str.toString());
		System.out.println("size of string"+str.length());
		System.out.println("hash code is"+obj.hashCode());
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		//finally {in.close();
		
		
	}
}
