package edu.whqa.basic;
import java.util.Scanner;


public class Array {
	private static Scanner in;

	public static void main( String args[]){
		
		in = new Scanner(System.in);
		System.out.println("Enter number size of the array\n");
		int size=in.nextInt();
		int []array=new int[size];
		System.out.println("Enter the numbers now\n");
		
		try{
			
			for (int i=0;i<array.length;i++){
				int k=in.nextInt();
				array[i]=k;
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("The Array is :");
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
			
		}
	}


