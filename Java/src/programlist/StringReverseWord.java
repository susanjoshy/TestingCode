// Write a program to reverse each individual word in a sentence.

package programlist;

public class StringReverseWord {
public static void main(String[] args) {
	String s="hello world maria";
	System.out.println("the orginal string is: "+s);
	String reverse="";
	String  arr1[]=s.split(" ");
	for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
	
	
	for(int i=arr1.length-1;i>=0;i--){
		reverse.concat(" ");
		
		reverse=reverse+arr1[i];
		
	}
	System.out.println("reversed words :"+reverse);
}
}
