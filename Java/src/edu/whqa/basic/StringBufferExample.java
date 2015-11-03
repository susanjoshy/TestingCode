package edu.whqa.basic;

public class StringBufferExample {
	
static void testStringBuffer(){
	StringBuffer sb=new StringBuffer("Welcome");
	
	sb.append("world");
StringBuilder sbd=new StringBuilder("Welcome");
	sbd.append("world");
	
	String s="Welcome";
	s.concat("world");
	System.out.println(sb);
	System.out.println(s);
	System.out.println(sbd);
}
	public static void main(String[] args) {
		StringBufferExample.testStringBuffer();

	}

}
