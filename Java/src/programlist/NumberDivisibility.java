/* Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
and "ping pong" if number is divisible by both, else print the number. */

package programlist;

import java.util.Scanner;

public class NumberDivisibility {
	public static void divisibilityRule(int n){
		
		
		
		if(n%3==0){
		
		
		
			System.out.println("ping");
		}
		
		  if (n%5==0){
				System.out.println("Pong");
		    }	
		   if(n%3==0&&n%5==0) {
					System.out.println("pingpong");
		 		}
		
		else if(n%3!=0 && n%5!=0){
					System.out.println(n);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to divide ");
		int n=s.nextInt();
		s.close();
		NumberDivisibility.divisibilityRule(n);
	}


}