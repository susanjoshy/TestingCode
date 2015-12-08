//Write a program to check for a palindrome string.


package programlist;

import java.util.Scanner;

public class StringPalindrome {
	static void PalindromeString(String str){
		String reverse="";
		System.out.println("Reversed string :");
		for(int i=str.length()-1;i>=0;i--){
			
				System.out.print(str.charAt(i));
				reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)){
			System.out.println("\n"+str +"is palindrome");
			
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
	public static void main(String[] args) {
		
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string to reverse(malayalam)");
			String str1=s.nextLine();
			s.close();
			StringPalindrome.PalindromeString(str1);
			
		
	}	

}
