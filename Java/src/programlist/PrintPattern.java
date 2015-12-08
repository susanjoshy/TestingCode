
/*Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		*******/

package programlist;

import java.util.Scanner;

public class PrintPattern {
	public  static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows u want to print");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	s.close();	
	}

}
