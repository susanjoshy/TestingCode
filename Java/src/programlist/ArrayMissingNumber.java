//Write a program to find the missing number in a series (numbers from 1 to 100) of sorted array.
//
package programlist;

import java.util.Scanner;

public class ArrayMissingNumber {
	public static int  missingNumber(int array[],int totalcount){//using linear search
		
		int sum=(totalcount*(totalcount+1)/2);//find the sum of 1st n numbers.
		System.out.println(sum);
		int sumarray=0;
		for(int i=0;i<totalcount-1;i++){
		sumarray+=array[i];//sum of (n-1)numbers in array
		}
		System.out.println(sumarray);
		return sum-sumarray;// the 1 missing number
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		int totalcount=size+1;
		System.out.println("size is"+size);
		int array[]=new int[size];
		System.out.println("Enter the array elemnts from 1 to n in a series");
		for(int i=0;i<size;i++){
			
			array[i]=s.nextInt();
			
			
		}
		s.close();
		System.out.println("array is ");
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
		int number=ArrayMissingNumber.missingNumber(array, totalcount);
		System.out.println("missing number is "+number);
	}

}
