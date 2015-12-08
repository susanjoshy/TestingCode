 //Write a program to find a substring in a given string and then replace it with another string.

package programlist;

import java.util.Scanner;

public class SubString {
	static void replaceString(String str){
		
		String str1=str.substring(6);
	
		System.out.println("substring is :"+str1);
		System.out.println(str.replace(str1,  "maria"));
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string to reverse(Enter hello world)");
			String str1=s.nextLine();
			s.close();
			SubString.replaceString(str1);
			
		
	}

}
