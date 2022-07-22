package Loops;

import java.util.Scanner;

public class PrintVowels {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	    String word = inp.nextLine();
	    //write your code below
	    
	    
	    for(int i=0;i<word.length();i++) {
	    	
	    if(word.substring(i,i+1).contains("a")|word.substring(i,i+1).contains("e")|word.substring(i,i+1).contains("i")|word.substring(i,i+1).contains("o")|
	    		word.substring(i,i+1).contains("u")) {
	    	
	    	System.out.print(word.substring(i,i+1));
	    	
	    }
	    	
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
