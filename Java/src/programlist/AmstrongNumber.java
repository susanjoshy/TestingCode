//Write a program  to check an armstrong number i.e. whether if we power up the each individual number to the total number of digits 
//in the number and add them it should be equal to the number itself.
//For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.



package programlist;

import java.util.Scanner;

public class AmstrongNumber {
	AmstrongNumber(int n){
		
		int mod,digit=0;
		int number=n;
		double pow1=0;
		while(number>0){
			digit++;
			number=number/10;
		}
		number=n;
			while(number>0){
		mod=number%10;
		System.out.println(mod);
		 pow1=pow1+Math.pow(mod,digit);
		 System.out.println(pow1);
		 number=number/10;
		 
			}
		
		if (pow1==n){
			System.out.println("It is an amstrong ");
		}
		else{
			System.out.println("not");
		
		
		}
	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number u want to find if Amstrong or not");
		int n=s.nextInt();
		new AmstrongNumber(n);
		s.close();
	}

}
