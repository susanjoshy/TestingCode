package programlist;

import java.util.Scanner;



public class ArrayLargest {
	
public static	int  largest(int a[]){	
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				
			}
		}
		
		return max;
	}
	
static int  smallest(int a[]){	
	int min=a[0];
	for(int i=0;i<a.length;i++){
		if(min>a[i]){
			min=a[i];
			
		}
	}
	
	return min;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers u want in array");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.println("enter the numbers in the array");
		
		for(int i=0;i<size;i++){
			
			array[i]=s.nextInt();
		}
		s.close();
		for(int i=0;i<size;i++){
		
			System.out.print("array is"+array[i] +" ");
		}
		int large=ArrayLargest.largest(array);
		
		System.out.println("\nLargest is :"+large);
		
		int small=ArrayLargest.smallest(array);
		System.out.println("Min is: "+small);

	}


}
