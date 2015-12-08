
 /*Write a program to search for a string in a file and then 
 return the count of number of occurrences of the string.
*/
package programlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringOccurence {
	public static void main(String[] args) {
		int count=0;	
			boolean value=false;
			String str=null;
		
		try{
			
			Scanner s=new Scanner(System.in);
			FileReader fReader=new FileReader("/Users/susanjoshy/Desktop/testiofile.txt");
			BufferedReader bReader=new BufferedReader(fReader);
			String line=bReader.readLine();
			System.out.println("enter the string to search");
			str=s.next();
			//System.out.println(str);
			s.close();
			System.out.println("the content of the file is :");
			while(line!=null){
				String words[]=line.split(" ");
				
				for(String w:words){
					System.out.println(w);
					
					if(str.equals(w)){
						count++;
						//System.out.println("count is "+count);
						value=true;
						
					
					}
				
				}
			line=bReader.readLine();
			}
			
			
			bReader.close();
		
		}
		
			
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.println ("The String :"+str);  
		if(value==true){
			System.out.print(" :found :"+count+" times");
		}
		else

	           
	       
	                
	       System.out.println("not found");
	    }
	}


