import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class lzw {
	public static ArrayList<String>dic=new ArrayList<String>();
	public static ArrayList<Integer>code=new ArrayList<Integer>();

		public static void myCompress(String input) throws IOException {
			FileWriter myff = new FileWriter("compressed.txt");
			BufferedWriter mywrite = new BufferedWriter(myff);
			
				dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);
				dic.add("A");dic.add("B");dic.add("C");dic.add("D");dic.add("E");dic.add("F");dic.add("G");
				dic.add("H");dic.add("I");dic.add("J");dic.add("K");dic.add("L");dic.add("M");dic.add("N");
				dic.add("O");dic.add("P");dic.add("Q");dic.add("R");dic.add("S");dic.add("T");dic.add("U");
				dic.add("V");dic.add("W");dic.add("X");dic.add("Y");dic.add("Z");
				dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);

				String [] myString= input.split("");
				String prev="";
				String word="";

				for (int i = 0; i<myString.length; i++) {
					String curr=myString[i].toUpperCase();
				    word=prev+curr;
				    if (dic.contains(word.toUpperCase()))
				    {	
				    	prev=word;
				    }
				    else
				    {
				    	 code.add(dic.indexOf(prev));
				    	 dic.add(word.toUpperCase());
				    	 prev=curr;
				    }
				    
				}
				
					dic.add(word.toUpperCase());
					code.add(dic.indexOf(prev.toUpperCase()));
					
			
	
  
		
		for (int i = 0; i<code.size(); i++) {
			mywrite.write(code.get(i) + "-");
			
			
			
		}
		mywrite.close();
}

		public static void deCompress() throws IOException {
				File file = new File("compressed.txt"); 
				BufferedReader br = new BufferedReader(new FileReader(file)); 
				dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);
				dic.add("A");dic.add("B");dic.add("C");dic.add("D");dic.add("E");dic.add("F");dic.add("G");
				dic.add("H");dic.add("I");dic.add("J");dic.add("K");dic.add("L");dic.add("M");dic.add("N");
				dic.add("O");dic.add("P");dic.add("Q");dic.add("R");dic.add("S");dic.add("T");dic.add("U");
				dic.add("V");dic.add("W");dic.add("X");dic.add("Y");dic.add("Z");
				dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);dic.add(null);
				Integer mycode = null;
				char c;
				String input="";
				String word="";
				String curr="";
				String prev="";
				String str="";
				input+=br.readLine(); 
				String[] splt=input.split("-");
				ArrayList<Integer> coded = new ArrayList<Integer>();
				for (int i = 0; i <splt.length ; i++) {
					coded.add(Integer.parseInt(splt[i]));				
				}
				
				mycode=coded.get(0);
				prev=dic.get(mycode);
				word=word + prev;
				for(int i = 1 ; i<coded.size(); i++)
				{
					mycode = coded.get(i);
					curr = dic.get(mycode);
					if (dic.contains(curr)) {
						word+=curr;
						c = curr.charAt(0);
						dic.add(prev+c+"");
					
					}
					else {
						c = prev.charAt(0);
						dic.add(prev+c+"");
						word+=prev+c+"";
						
						
					}
					
						
					prev=curr;
					
				}				
			br.close();
			System.out.println(word);
			//System.out.println(dic);
			FileWriter myff = new FileWriter("uncompressed.txt");
			BufferedWriter mywrite = new BufferedWriter(myff);
			mywrite.write(word);
			mywrite.close();

			
			
		}
		
		
}