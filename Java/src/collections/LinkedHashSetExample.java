package collections;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
	
	LinkedHashSet<String> lhset=new LinkedHashSet<>();
	lhset.add("susan");
	lhset.add("Thomas");
	lhset.add("Ethan");
	lhset.add("Aston");
	lhset.add("susan");
	lhset.add(null);
	lhset.add(null);
	for(String s:lhset){
		System.out.println(s);
		
	}
}
}