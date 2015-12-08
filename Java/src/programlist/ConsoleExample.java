//Console: Use this class to input 2 integer numbers and divide them.

package programlist;

public class ConsoleExample {
	public static void main(String[] args) {
		
	
	System.out.print("Enter something:");
	String input1 = System.console().readLine();
	String input2=System.console().readLine();
	int number1=Integer.parseInt(input1);
	int number2=Integer.parseInt(input2);
	
	int c=number1/number2;
	System.out.println("Result is"+c);
	
	
	
}
}