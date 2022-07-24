package Loops;

import java.util.Scanner;

public class CatsAndDogs {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    int c=0;
	    
	    
	    for(int i=0;c+i<=word.length();i++) {
	    	
	    	if(word.substring(c+i,word.length()).contains("cat")) {
	    		countOfCats++;
	    		
	    		c=c+word.substring(c+i,word.length()).indexOf("cat");
	    			    			    		
	    	}
	    	
	    		    		    		    	
	    }
	c=0;
	    for(int i=0;c+i<=word.length();i++) {
	    	
	    	if(word.substring(c+i,word.length()).contains("dog")) {
	    		countOfDogs++;
	    		
	    		c=c+word.substring(c+i,word.length()).indexOf("dog");
	    			    			    		
	    	}
	    	
	    		    		    		    	
	    }
	
	
	
	
	if(countOfCats==countOfDogs) {System.out.println(true);}else {System.out.println(false);}
	
	
	
	
	
	
	
	
	
	
	
}
}
