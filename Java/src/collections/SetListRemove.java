package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetListRemove {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		HashSet<String> hset=new HashSet<>();
		list.add("susan");
		list.add("Thomas");
		list.add("Ethan");
		list.add("Aston");
		list.add("susan");
		list.add(null);
		list.add(null);
		System.out.println("List is ");
		for(String s:list){
			System.out.println(s);
			
		}
		
		hset.addAll(list);
		list.clear();
		list.addAll(hset);
		System.out.println("after moving ");
		for(String s:list){
			System.out.println(s);
			
		}
		

	}

}
