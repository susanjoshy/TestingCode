/*Write a program to perform a linear search on any given array.
Linear search is the basic search where you look for the element to be searched in a sequential way.

*/
package programlist;

import java.util.Scanner;


public class LinearSearch {
	static Scanner in;
	static void linearSearch(int array[],int number){
		
		
		int count=0;
		
		for(int j=0;j<array.length;j++){
			
			if(array[j]==number){
				System.out.println("the element is found at location"+(count+1));
				count+=1;
				
				
			}
		}
		if(count>0){
			System.out.println("the element found "+count+"times");
		}
		else	
			{
				System.out.println("no search found");
					
			}
		
		
	}
	public static void main(String args[]){
		
	System.out.println("Enter the numbers of elemnts u want in the array\n");
	 in = new Scanner(System.in);
	int size=in.nextInt();
	
	int []array=new int [size];
	System.out.println("Enter the numbers\n");
	try{
		for(int i=0;i<array.length;i++){
			 
			 array[i]=in.nextInt();
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	System.out.println("The array is :");
	for(int i=0;i<array.length;i++){
		System.out.print(" "+array[i]);
	}
	System.out.println("\nEnter the number u want to search for :");
	int number=in.nextInt();
	LinearSearch.linearSearch(array, number);
	
	
}
}