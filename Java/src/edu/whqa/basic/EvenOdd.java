package edu.whqa.basic;
import java.util.Scanner;


public class EvenOdd {
	
	private static Scanner scan;

	public static void main(String args[])
	{
		System.out.println("Enter the number\n");
		scan = new Scanner(System.in);
		int num=scan.nextInt();
		if (num%2==0){
			System.out.println("The number enterd is even");
		}
			else{
				System.out.println("The number enterd is odd");
			}
				
		}
		
	}


