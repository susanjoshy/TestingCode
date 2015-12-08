package AdvancedJava;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOWriter {

	public static void main(String[] args) {
	String fileName="/Users/susanjoshy/Desktop/testiofile.txt";
	try{
		//FileWriter fw=new FileWriter(fileName,true);//append at the end
		FileWriter fw=new FileWriter(fileName,false);//rewrite the file
		fw.write("are u learning java io?");
		fw.close(); //if not closing the filewriter the contents will not be written to the specified file
	}catch(IOException e){
		e.printStackTrace();
	}

	}

}
