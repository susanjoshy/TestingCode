//Write a program to count the number of words in a file.

package programlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsFile {
static 	BufferedReader bReader;
static	FileReader fReader;
	static int count=0;	
		
	static int countWords(String line){
		try{
	
		System.out.println ("Counting Words :");  
		while(line!=null){
			String words[]=line.split(" ");
		for(String w:words){
			count++;
		}
		line=bReader.readLine();
		}
		
		
		bReader.close();
	
	}catch(IOException e) {
		
		e.printStackTrace();
		
	}

       return count;
    }


public static void main(String[] args) {
	String line=null;
	try{
		
		
		fReader=new FileReader("/Users/susanjoshy/Desktop/testiofile.txt");
		bReader=new BufferedReader(fReader);
		line=bReader.readLine();
	}
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		int count=countWords(line);
		System.out.println("there are "+count+" words in this file");
		
}
}