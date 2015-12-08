/*Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
*/

package programlist;

import java.util.Scanner;

public class SwapNumbers {
	//Swap number with temp variable
	public static void swapNumbers(int a,int b){
		int c=a;
		a=b;
		b=c;
		System.out.println("The swapped numbers are: "+" " +a+ " "+b);
		
	}
	
	//Swap Numbers without 3rd variable
	
	public static void swapNumbers1(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The swapped numbers(without 3rd variable) are: "+a+" "+b);
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers u want to swap");
		int n1=s.nextInt();
		int n2=s.nextInt();
		SwapNumbers.swapNumbers(n1, n2);
		SwapNumbers.swapNumbers1(n1,n2);
		s.close();
		
	}

}
