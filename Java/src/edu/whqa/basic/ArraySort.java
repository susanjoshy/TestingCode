package edu.whqa.basic;

public class ArraySort {
void sortArray(int arr[]){

	System.out.println("given Array is ");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		
	}
	
	int temp;
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++)
	{

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
		ArraySort ar=new ArraySort();
		int arr[]={231,12,782,21,90,15};
		ar.sortArray(arr);

	}

}
