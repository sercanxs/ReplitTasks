package String;

import java.util.Scanner;

public class WithoutX_x {
public static void main(String[] args) {
	
	
	  Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	    if(word.substring(0,1).contains("X")|word.substring(0,1).contains("x")) {
	    	
	    	word=word.replaceFirst(word.substring(0,1), "");
	    	
	    	
	    	
	   }
	
	if(word.substring(word.length()-1,word.length()).contains("X")|word.substring(word.length()-1,word.length()).contains("x")) {
		
		
		
		word=word.substring(0,word.length()-1);
				
		
		
		
	}
	
	
	
	System.out.println(word);
	
	
}
	
	
	
	
}
