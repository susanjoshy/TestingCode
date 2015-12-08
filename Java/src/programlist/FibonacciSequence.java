
//Write a program that prints a  series that is a sequence of numbers 

package programlist;

import java.util.Scanner;

public class FibonacciSequence {
	
	public static void printFibSeries(int n,int array[]){
		array[0]=0;array[1]=1;
		System.out.println("The 1st  "+ n+"  Fib series :\n");
		System.out.print(array[0]);
		System.out.print(" "+array[1]);
		 for(int i=2;i<array.length;i++){
			array[i]=array[i-1]+array[i-2];			 
			System.out.print(" "+array[i]);
		 }
			
			
			
		}
	
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter for how many numbers u want the fib seq");
	
	 int n=s.nextInt();
	 int []array=new int [n];
	
	 FibonacciSequence.printFibSeries(n,array);
	 s.close();
	 
	}
	
	

}
