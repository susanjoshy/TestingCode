package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		
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
//	Iterator<String> it=hset.iterator();
//	while(it.hasNext()){
//	System.out.println(it.next());
//	}
		

}
}
