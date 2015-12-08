package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		//no insertion order for set,no duplicates
		HashSet<String> hset=new HashSet<>();
		hset.add("susan");
		hset.add("Thomas");
		hset.add("Ethan");
		hset.add("Aston");
		hset.add("susan");
		hset.add(null);
		hset.add(null);
		for(String s:hset){
			System.out.println(s);
			
		}
		System.out.println("Print using Iterator");
	Iterator<String> it=hset.iterator();
	while(it.hasNext()){
	System.out.println(it.next());
	}
		
		
		
		

}
}
