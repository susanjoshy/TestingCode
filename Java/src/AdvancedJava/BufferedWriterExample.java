package AdvancedJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try{
		File tmpFile=new File("/Users/susanjoshy/Desktop/testiofile2.txt");
		FileOutputStream fos=new FileOutputStream(tmpFile);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
				//new OutputStreamWriter(new FileOutputStream(tmpFile)));
	
		bw.write("This is a file using Buffered Writer");
		bw.close();
		System.out.println(tmpFile.getPath());
}catch(IOException e){
	e.printStackTrace();
}
}

}
