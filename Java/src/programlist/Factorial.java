/*Write a program  to calculate factorial of a given number. You need to compute the factorial 
with one logic that uses recursion and another logic without recursion.
*/
package programlist;

import java.util.Scanner;

public class Factorial {
	//Find the factorial without recursion
	
	public static int  factNumber(int number)
	{
		int fact=number;
		for(int i=1;i<number;i++)
		{
			fact=fact*i;
	}
 return fact;
}
	
	 //Find the factorial with recursion
	
	public static int recurFact(int n){ 
		if(n==0)
			return 1;
		else
			return n*recurFact(n-1);
		
	}
	
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number you want to find the factorial");
	int n=s.nextInt();
	int fact=Factorial.factNumber(n);
	int value=	Factorial.recurFact(n);
	System.out.println("Factorial is :"+fact);
	System.out.println("Factorial using recursion is :"+value);
	s.close();
}


}