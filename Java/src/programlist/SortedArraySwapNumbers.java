/*Write a program to locate and swap only 2 elements which are not sorted in a given sorted array.
For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.
*/
package programlist;

import java.util.Scanner;

public class SortedArraySwapNumbers {
	static void swapNumbers(int arr[]){
		
		    // Travers the given array from rightmost side
		    for (int i=arr.length-1; i> 0; i--)
		    {
		        // Check if arr[i] is not in order
		        if (arr[i] <arr[i-1])
		        {
		            // Find the other element to be
		            // swapped with arr[i]
		            int j = i-1;
		            while (j>=0 && arr[i] < arr[j])
		                j--;
		 
		            // Swap the numbers
		           
		            int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
		           
		            break;
		       
		   
		        }
		    }
		    for(int j=0;j<arr.length;j++)
		    	System.out.println(arr[j]);
		    
	}	
		
		
		
		
	
		
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements of sorted array with 2 elements not in the right position");
		
		for(int j=0;j<size;j++){
			array[j]=s.nextInt();
		}
		s.close();
		SortedArraySwapNumbers.swapNumbers(array);
		
		
		
	}
		
	
		

}


