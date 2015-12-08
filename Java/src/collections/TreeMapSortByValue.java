package collections;

import java.util.Map;
import java.util.TreeMap;

import programlist.ValueComparator;

public class TreeMapSortByValue {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>tmap=new TreeMap<>();
		ValueComparator vcmp=new ValueComparator(tmap);
		tmap.put(109,"thomas");
		tmap.put(104,"susan");
		tmap.put(103, "maria");
		tmap.put(101,"aston");
		tmap.put(106,"josh");
		tmap.put(101,"ethan");
		tmap.put(102,"susan");
		System.out.println("the treemap(by default is  sorted with keys in ascening order)");
		for(Map.Entry entry:tmap.entrySet()){
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		System.out.println("the tree map with sorted values ");
		 for(Map.Entry map : tmap.entrySet())
		  {
			  System.out.println(map.getKey() + " " + map.getValue());
		  }
	}

}
