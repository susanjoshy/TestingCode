/* Write a program having different methods to perform below operations.

  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.

*/
package programlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListOperations {
	static ArrayList<String> list;
	static Iterator it;
	static ListIterator<String> lit;
	
	static void addElements(){
		
		list =new ArrayList<String>();
		list.add("susan");
		list.add("maria");
		list.add("ethan");
	}
	static void searchElement(){
		
		if(list.contains("maria"))
			System.out.println("Elmt exists");
		
	}
	static void printElements(){
		System.out.println("print using Iterator");
		it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	static void reversePrint(){
		System.out.println("print using ListIterator");
		lit=list.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		System.out.println("reverse order using listiterator");
		while(lit.hasPrevious()){
			
			System.out.println(lit.previous());
		}
	}
	public static void main(String[] args) {
		 ArrayListOperations.addElements();
	
		 ArrayListOperations.printElements();
		 ArrayListOperations.searchElement();
		 ArrayListOperations.reversePrint();		
	}
	

}
