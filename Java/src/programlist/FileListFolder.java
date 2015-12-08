
//Write a program to show list of all file names in a folder.

package programlist;

import java.io.File;

public class FileListFolder {
	public static void main(String args[]){
        File file = new File("/Users/susanjoshy/Desktop");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println("Name  :"+f.getName()+"  Path :"+f.getPath()+" Parent :"+f.getParent());
        }
    }
}