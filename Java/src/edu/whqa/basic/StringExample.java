package edu.whqa.basic;

public class StringExample {

	public static void main(String[] args) {
	String s2=new String("Welcome");
		String s1= "Welcome";
		String s3="Welcome";
		System.out.println(s1.charAt(0));
		System.out.println("Length "+s1.length());
		System.out.print("reversed String :");
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
		if(s1.equals(s2)){
			System.out.println("\nEqual");
			}
		if(s1.equals(s3)){	
				System.out.println("strings  Equal");
		}
		if(s1==s2){
			System.out.println("strings are equals");
			
		}
		else{
			System.out.println("not equal");
		}
		if(s1==s3){
			System.out.println("strings are equals");
			
		}
		else{
			System.out.println("not equal");
			
			
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
	}

}
