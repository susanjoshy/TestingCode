package collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListExample {
public static void main(String[] args) {
	//to store the objects
	ArrayList<String> l=new ArrayList<String>();
	l.add("Susan");
	l.add("Maria");
	l.add("Thomas");
	l.add("Aston");
	//l.add(Integer.valueOf(100));
	//retrieve elements
	for(int i=0;i<l.size();i++)
	System.out.println(l.get(i));
	//retrieve list elements 
	System.out.println("list is"+l);
	//for each loop to retrieve  collection objects
	
	for(String s:l){
		System.out.println(s);
		
		//to come out of for loop
		if(s.equals("Thomas")){
			break;
		}

	}
	//retrieve collection objects 
	Iterator<String> it =l.iterator();
	System.out.println("from Iterator Interface");
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
