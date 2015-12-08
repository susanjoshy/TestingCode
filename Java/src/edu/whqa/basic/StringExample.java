package edu.whqa.basic;

public class StringExample {

	public static void main(String[] args) {
	String s2=new String("Welcome");
		String s1="malayalam";
		String s3="Welcome";
		String reverse="";
		System.out.println(s1.charAt(0));
		System.out.println("Length "+s1.length());
		System.out.print("reversed String :\n");
		for(int i=s1.length()-1;i>=0;i--){
			System.out.println(s1.charAt(i));
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("\nReversed string is: "+reverse);
		if(s1.equals(reverse)){
		System.out.println("it is palindrome");	
		}
		else{
			System.out.println("not palindrome");
		}
		if(s1.equals(s2)){
			System.out.println("\ns1 and s2 Equal");
			}
		if(s1.equals(s3)){	
				System.out.println("s1 and s3 strings  Equal");
		}
		if(s1==s2){
			System.out.println("string s1 and s2 are equals");
			
		}
		else{
			System.out.println("s1 and s2 are not equal");
		}
		if(s1==s3){
			System.out.println("string s1 and s3  are equals");
			
		}
		else{
			System.out.println("s1 and s3 not equal");
			
			
		}
		 String s4="Maria";
		System.out.println(s1.substring(3,6));//exclude last index
		System.out.println(s1.substring(3));// start from 3 until end
		if((s1.compareTo(s4))==0){
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		 String s5="Hello World Susan";
		 String arr[]=s5.split(" ");
		 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]);
		 }
		 System.out.println(s1.replace("come","go"));
		 System.out.println(s1);
		 s1=s1.replace("come","go");
		 System.out.println(s1);
		 System.out.println(s1.compareTo(s2));
	
String s7="susan";
System.out.println(s7.concat("thomas"));

}
}