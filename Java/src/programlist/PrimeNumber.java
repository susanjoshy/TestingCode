 
 //Write a program  to check if a given number is prime or not.

package programlist;

import java.util.Scanner;

public class PrimeNumber {
	
	PrimeNumber(int num)
	{
	
	if (num %2==0)
		System.out.println("Not prime");
	else
		System.out.println(num +": is prime");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number u want to check for prime or not");
		int n=s.nextInt();
		new PrimeNumber(n);
		s.close();
	}

}
