package AdvancedJava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateNewFile {

	public static void main(String[] args) {
		try{
		File tmpFile=new File("/Users/susanjoshy/Desktop/testiofile1.txt");
		
			boolean b= tmpFile.createNewFile();//if file not present ,it will create a new file
			FileWriter fw=new FileWriter(tmpFile.getPath(),true);
			
		      
			fw.write("This is a test file ");
			fw.close();
			System.out.println(tmpFile.getPath());
			System.out.println("File created"+b);
//			if (tmpFile.createNewFile()){
//		        System.out.println("File is created!");
//		      }else{
//		        System.out.println("File already exists.");
//		      }
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
