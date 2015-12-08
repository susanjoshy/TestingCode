//DatainputStream: Use this class to input 2 integer numbers and multiply them.


package programlist;

import java.io.DataInputStream;
import java.io.IOException;


public class DataInputStreamExample {

	public static void main(String[] args) {
		int result=0;
		DataInputStream dis=new DataInputStream(System.in);
		try{
			System.out.println("enter number1  ");
			
			int num1=Integer.parseInt(dis.readLine());
			
			System.out.println("number is  "+num1);
			System.out.println("enter number 2 ");
			int num2=Integer.parseInt(dis.readLine());
			System.out.println("number is "+num2);
			 result=num1*num2;
	
		} catch (NumberFormatException ex) {
	       System.out.println("Not a number");
		  } catch (IOException e) {
			  e.printStackTrace();
	      	}
		System.out.println(result);

	}
}