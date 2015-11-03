package edu.whqa.basic;
import java.util.Scanner;


public class ArrayReverse {
	private static Scanner in;

	public static void  main(String args[]){	
	
	System.out.println("Enter how many numbers u want in the array\n");
	in = new Scanner(System.in);
	int size=in.nextInt();
	int []array=new int [size];
	System.out.println("Enter the numbers\n");
	try{
		for(int i=0;i<array.length;i++){
			 int  j=in.nextInt();	
			 array[i]=j;
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	
		int j=0;
		int k=array.length-1;
		while(j<k){
			int temp=array[j];
			array[j]=array[k];
			array[k]=temp;
			j++;k--;
					
	}
	System.out.println("The Reversed Array is");
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
	
	
	}
}

	
	
	
	
			
		
	
	
	
	
