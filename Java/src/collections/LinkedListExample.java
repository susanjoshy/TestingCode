package collections;

import java.util.LinkedList;

public class LinkedListExample {
	static void linkedList()
	{
		LinkedList<String> l=new LinkedList<String>();
	
		l.add("Susan");
		l.add("Maria");
		l.add("Thomas");
		l.add("Aston");
		for(String s1:l){
			System.out.println(s1);
		}
		
	}

	public static void main(String[] args) {
		LinkedListExample.linkedList();
	}

}
