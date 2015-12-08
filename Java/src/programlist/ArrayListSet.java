
//Write a program to find duplicates in an array using set.
package programlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class ArrayListSet {
	
	static ArrayList <String>list;
	static Iterator it;
	static HashSet<String>s;
	static void addElements(){
		
		list =new ArrayList<String>();
		list.add("susan");
		list.add("maria");
		list.add("ethan");
		list.add("susan");
		
	}	
	static void addToSet(){
		s=new HashSet<>();
		s.addAll(list);
		printSetElements();
		
	}
	static void printSetElements(){
		System.out.println("  Set elements (duplicates removed from ArryList) ");
		it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	static void printArrayListElements(){
		System.out.println(" ArrayList Elements");
		it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
public static void main(String[] args) {
	 ArrayListSet.addElements();
	 ArrayListSet.printArrayListElements();
	 ArrayListSet.addToSet();
}
}
