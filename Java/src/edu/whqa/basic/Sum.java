package edu.whqa.basic;
import java.util.Scanner;
public class Sum {
private static Scanner scan;
private static int addTwoNumbers(int a ,int b)
{
	return a+b;
	
}
public static void main(String args[]){
	scan = new Scanner(System.in);
	System.out.println("enter your name\n");
	String name=scan.nextLine();
	System.out.println("enter 1st number\n");
	
	int num1=scan.nextInt();
	System.out.println("enter 2n  number\n");
	int num2=scan.nextInt();
	//int num3=num1+num2;
	System.out.println("your name is:"+name);
	System.out.println("the answer is\n"+addTwoNumbers(num1,num2));
	
	
}
}
