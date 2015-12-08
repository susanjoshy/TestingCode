
//Write a program to copy arraylist to an array.

package programlist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToarray {
	static ArrayList <String>list;
	static Iterator it;
	
	static void addElements(){
		
		list =new ArrayList<String>();
		list.add("susan");
		list.add("maria");
		list.add("ethan");
		list.add("susan");
	}
		static void copyArray(){
			
		String array[]=new String[list.size()];
		for(int i=0;i<array.length;i++){
			array[i]=list.get(i);
		}
		
		System.out.println("arraylist to array elemnets");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		
		}
		}
	
		
		static void printArrayListElements(){
			
			System.out.println("print using Iterator");
			it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	
public static void main(String[] args) {
	ArrayListToarray.addElements();
	ArrayListToarray.printArrayListElements();
	ArrayListToarray.copyArray();

}
}
	


