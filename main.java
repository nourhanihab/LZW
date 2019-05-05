import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.print.attribute.standard.Compression;

public class main {

	public static void main(String[] args) throws IOException {
		 File file = new File("read.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String input="";
		  input+=br.readLine(); 
		  lzw.myCompress(input);
		 //System.out.println(lzw.dic);
		 // System.out.println(lzw.code);
		  lzw.deCompress();
		  
		  
	}

}
