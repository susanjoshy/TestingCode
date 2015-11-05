package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	static void accessElements(ArrayList<String> l){
		ListIterator<String> li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Reverse Order");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
			
		
	}

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Susan");
		l.add("Maria");
		l.add("Thomas");
		l.add("Aston");
		ListIteratorExample.accessElements(l);
	

	}

}
