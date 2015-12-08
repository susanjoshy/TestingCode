//Write a program to find the common number in any given two arrays.

package programlist;

import java.util.Scanner;

public class ArrayCommonNumber {
	static void findCommonNumber(int a1[],int a2[],int size1,int size2){
	int count=0;
	int a3[]=new int[size1];
	for(int i=0;i<size1;i++){
		for(int j=0;j<size2;j++){
			
			if(a1[i]==a2[j]){
				
				
				int m=a1[i];
				
				
				
				a3[count]=m;
				
				
				count=count+1;
			}
		
		
	
		}		
	}
	if(count>0){
		System.out.println("\nThe common number is  :");
	for(int k=0;k<count;k++){
		
		System.out.print(a3[k]);
	}
	}
	else{
		System.out.println("no common numbers");
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
	ArrayCommonNumber.findCommonNumber(a1, a2, size1, size2);
	
}
}

