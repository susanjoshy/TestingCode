package collections;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
	//linkedhashset holds the insertion order ,no duplicates
	LinkedHashSet<String> lhset=new LinkedHashSet<>();
	lhset.add(null);
	lhset.add("Joshy");
	lhset.add("susan");
	lhset.add("Thomas");
	lhset.add("Ethan");
	lhset.add("Aston");
	lhset.add("susan");
	lhset.add(null);
	System.out.println("In linked hash set the values are inserted in order");
	for(String s:lhset){
		System.out.println(s);
		
	}
}
}