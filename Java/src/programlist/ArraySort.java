package programlist;

import java.util.Scanner;

public class ArraySort {
	static void sortArray(int arr[]){

	System.out.println("given Array is ");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		
	}
	
	int temp;
	for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
	

		if(arr[i]>arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	}
	


	System.out.println("\nSorted array is ");
	for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}
}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		
		int array[]=new int[size];
		System.out.println("enter the array elemnts");
		for(int j=0;j<array.length;j++){
			array[j]=s.nextInt();
		}
		s.close();
		ArraySort.sortArray(array);

	}

}
