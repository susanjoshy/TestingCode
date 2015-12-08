package collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//treeset sortes in  ascending order
		TreeSet<String> tset=new TreeSet<>();
		tset.add("vijay");
		tset.add("ajay");
		tset.add("jay");
		
		for(String s:tset){
			System.out.println(s);
			
		}
		 

	}

}
