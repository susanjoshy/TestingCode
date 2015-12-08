
//Write a program to sort a map by value.

package programlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSort {
	public static void main(String[] args) {
		Map<Integer,String> hmap=new HashMap<>();
		ValueComparator vcmp=new ValueComparator(hmap);
		TreeMap<Integer,String> sortedMap=new TreeMap<>(vcmp);
		hmap.put(109,"thomas");
		hmap.put(104,"susan");
		hmap.put(103, "maria");
		hmap.put(101,"aston");
		hmap.put(106,"josh");
		hmap.put(101,"ethan");
		hmap.put(102,"susan");
		System.out.println("the map values ,no insertion order,but no duplicate keys,but duplicate values");
		 for(Map.Entry map : hmap.entrySet())
		  {
			  System.out.println(map.getKey() + " " + map.getValue());
		  }
		 //to exract the keys
		 System.out.println("the keys retrieved using keyset()");
		  Set<Integer> set=hmap.keySet();
		 for(Integer key:set){
			 System.out.println(key);
		 }
		 //to retrieve the values
		 System.out.println("the values retrieved using values()");
		 Collection<String>list=hmap.values();
		 for(String s:list)
			 System.out.println(s);
		 
		 
		 sortedMap.putAll(hmap);
		 System.out.println("the sorted values");
		 for(Map.Entry map : sortedMap.entrySet())
		  {
			  System.out.println(map.getKey() + " " + map.getValue());
		  }
		 
	}

}


