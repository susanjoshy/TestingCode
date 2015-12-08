package AdvancedJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) {
		try{
			File tmpFile=new File("/Users/susanjoshy/Desktop/testiofile1.txt");
			FileInputStream fis=new FileInputStream(tmpFile);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			String str=null;
		
			boolean end=false;
			System.out.println("Reading  from Input file....");
			while(!end){
				str=br.readLine();
				if(str==null){ 
					System.out.println("End of file ");
					end=true; }
				else
				{
					System.out.println("Content of file is: "+str);
				}
			}
			
		br.close();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
	}


