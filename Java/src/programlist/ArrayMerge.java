//Write a program to merge 2 arrays.

package programlist;

import java.util.Scanner;

public class ArrayMerge {
	static void mergeArray(int arr1[],int arr2[]){
		int size=arr1.length+arr2.length;
		System.out.println("\nsize is "+size);
		int arr3[]=new int[size];
		for(int i=0;i<arr1.length;i++){
			for(int k=0;k<arr1.length;k++){
				arr3[k]=arr1[i];
			}
		}
			/*for(int j=0;j<arr2.length;j++){
				int k=0			while(k<arr3.length){
					arr3[k]=arr1[i];
					k++;
					arr3[k]=arr2[j];
				}
			}
		}*/
		for(int l=0;l<arr3.length;l++){
			System.out.println("merged array is "+arr3[l]);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many nos u want in array1");
		
		int size1=s.nextInt();
		int a1[]=new int[size1];
		System.out.println("Enter  nos u want in array2");
		for(int i=0;i<size1;i++){
			
			a1[i]=s.nextInt();
		}
		for(int i=0;i<size1;i++)
			System.out.print(" "+a1[i]);
		System.out.println("\nEnter how many nos u want in array2");
		
		int size2=s.nextInt();
		int a2[]=new int[size2];
		System.out.println("Enter  nos u want in array2");
		for(int i=0;i<size2;i++){
			
			a2[i]=s.nextInt();
		}
		s.close();
		for(int j=0;j<size2;j++){
		System.out.print(" "+a2[j]);	
		}
		ArrayMerge.mergeArray(a1, a2);
		
	}

}
