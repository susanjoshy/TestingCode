
//Write a program to copy content of file into another file.

package programlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopy {
	static FileReader fr;
	static BufferedReader br;
	static FileWriter fw;
	static BufferedWriter bw;
	public static void main(String args[]) throws IOException {
	      try {
	    	  /*File file1 = new File("/Users/susanjoshy/Desktop/testiofile.txt");
	    	    FileInputStream fis = new FileInputStream(file1);
	    	    BufferedReader in = new BufferedReader(new InputStreamReader(fis));*/
	         fr=new FileReader("/Users/susanjoshy/Desktop/testiofile.txt");
	          br=new BufferedReader(fr);
	         fw=new FileWriter("/Users/susanjoshy/Desktop/testiofile3.txt");
	          
	         /* File file=new File("/Users/susanjoshy/Desktop/testiofile3.txt");
	  		FileOutputStream fos=new FileOutputStream(file);
	  		OutputStreamWriter osw=new OutputStreamWriter(fos);*/
	  		bw=new BufferedWriter(fw);
	          String s=br.readLine();
	         
	          while(s!=null) {
	        	  System.out.println(s);
	            bw.write(s);
	           bw.newLine();
	           s=br.readLine();
	          }
	          
	          
	      } catch(IOException e) {
	          System.out.println(e);
	      }
	      finally{
	      bw.close();
			br.close();
	      }	
	     

	}
}

