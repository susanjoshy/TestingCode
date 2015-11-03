package edu.whqa.basic;

public class StaticExample {
	int id;
	String name;
	static String dept="HR";
	static int count=0;
	
	public StaticExample(){ //count is for class
		count ++;
		System.out.println("Count is "+count);
	}
	static void test(int i)    //static method
	{
	i=10;
	System.out.println(i);
	System.out.println(count);//static method accessing the static variable
	}
	static                 //static block 
	{
		System.out.println("We are in sttaic block");
	}
	public static void main(String[] args) {
		  new StaticExample();
		new StaticExample();
		System.out.println(StaticExample.dept);
		StaticExample.test(30);//calling static method
		StaticExample.test(20);
		
		// TODO Auto-generated method stub

	}

}
