
/*Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.
*/
package programlist;





import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class HashMapSearch {
	
	static void searchMap(HashMap<Integer,String> hmap,Integer n){
		
		String value="";
		boolean search=false;
		System.out.println("the number is "+n);
		for(Map.Entry<Integer,String> m:hmap.entrySet())
			
			//System.out.println(m.getKey()+ " "+m.getValue());
		
			if(n==m.getKey()){
				System.out.println("key is"+m.getKey());
				search=true;
				value=m.getValue().toString();
				break;
				
			}
				
			if(search==true){
				System.out.println("key found and the value is "+value);
			}
		else
			System.out.println("the key not found");
			
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap=new HashMap<>();	
		 
		 Scanner input=new Scanner(System.in);
		
		    /*String name = "";
		   Integer key ;
		    while (true){
		    	System.out.println("Enter name:");
		        name = input.next();
		       
		        if (name.equals("end")) {
		            break;
		        }
		        System.out.println("Enter key:");
		        key = input.nextInt();//Integer.valueOf(input.next());
		        hmap.put(key,name);
		        
		    }
		        for(Map.Entry m:hmap.entrySet())
				{
					System.out.println(m.getKey()+ " "+m.getValue());
				}
		    
		    */
		
		
		hmap.put(100, "Susan");
		hmap.put(101,"Aston");
		hmap.put(102,"Ethan");
		hmap.put(103,"Aston");
		for(Map.Entry m:hmap.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
    
		//System.out.println(hmap);
		//retrieve  elements Map.Entry and entryset()
		
		//to search for a key
		System.out.println("entet the key u want to search for");
		
		
		
		Integer n=input.nextInt();
		input.close();
		HashMapSearch.searchMap(hmap,n);
		
		
		
		//System.out.println(hmap.keySet());
		/*Set<Integer> s=hmap.keySet();//to retrieve keys use keySet()
		System.out.println("The keys are :");
		for(Integer i:s){
			System.out.println(i);
		}*/
		
		//System.out.println(hmap.values());
		/*Collection<String> list=hmap.values();//to retrieve values use values()
		System.out.println("The values are");
		for(String str:list){
			System.out.println(str);
		}*/
	}

}
