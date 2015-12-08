package programlist;

import java.util.Scanner;

public class StringReverse {
	
	static String reverseString(String str){
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			
				System.out.println(str.charAt(i));
				reverse=reverse+str.charAt(i);
				
				
			}
			
			return reverse;
		}
		
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str1=s.nextLine();
		s.close();
		String str2=reverseString(str1);
		System.out.println("\nReversed string is: "+str2);
	}

}
