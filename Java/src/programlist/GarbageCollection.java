package programlist;

public class GarbageCollection {
	public static void main(String[] args) {

		   int arr1[] = { 90, 11, 21, 35, 14, 5 };
		   int arr2[]={23,56,12,67,89};
		   for(int ar:arr2)
		    System.out.println(ar);
		   // copies an array from the specified source array
		   System.arraycopy(arr1, 0, arr2, 0, 4);
		   
		   
		   System.out.print("new array2 is ");
		   
		   for(int j=0;j<4;j++)
		   System.out.println(+arr2[j]);
		   
		      
		   // it runs the GarbageCollector
		   System.gc();
		   System.out.println("Cleanup completed..."); 

}
}