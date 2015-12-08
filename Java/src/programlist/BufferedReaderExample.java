/*BufferedReader and InputStreamReader:

	Use this classes to input 2 integer numbers and subtract them
*/

package programlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) {
	    String input = null;
	    int result=0;
	    try {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("enter the 1st number");
	        input = bufferedReader.readLine();
	       int  number1 = Integer.parseInt(input);
	       System.out.println("enter the 1st number");
	       input=bufferedReader.readLine();
	       int number2=Integer.parseInt(input);
	       result=number1-number2;
	        
	    } catch (NumberFormatException ex) {
	       System.out.println("Not a number");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Result is "+result);
	}

}
