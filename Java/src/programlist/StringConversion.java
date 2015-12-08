
/*Write a program which accepts a string like "This is nice" and converts it to a string like
"This1 is2  nice3"
*/
package programlist;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {
		int count=0;
		String str1="";
		
		Scanner s=new Scanner(System.in);
		String str[]=s.nextLine().split(" ");
		for(String st:str){
			count++;
			str1=st+count;
			
			System.out.print(" "+str1);
			
		}
			
		
	
		
s.close();

	}

}
