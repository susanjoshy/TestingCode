package edu.whqa.basic;

public class ArrayExample {
	
int  largest(int a[]){	
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				
			}
		}
		
		return max;
	}
	
int  minimum(int a[]){	
	int min=a[0];
	for(int i=0;i<a.length;i++){
		if(min>a[i]){
			min=a[i];
			
		}
	}
	
	return min;
}
	public static void main(String[] args) {
		int a[]={23,450,78,11,89};
		ArrayExample ex=new ArrayExample();
		for(int i=0;i<a.length;i++){
		
			System.out.print(a[i] +" ");
		}
		int l=ex.largest(a);
		
		System.out.println("\nLargest is :"+l);
		
		int min=ex.minimum(a);
		System.out.println("Min is: "+min);

	}

}
