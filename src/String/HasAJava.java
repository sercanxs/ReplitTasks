package String;

import java.util.Scanner;

public class HasAJava {
public static void main(String[] args) {
	  
	
	
	
	boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
 if(word.length()<5) {
	 if(word.substring(0,word.length()).contains("java")) {
		 exists=true;
		 
	 }
	 
	 
 }
 else if(word.substring(0,5).contains("java")) {
	    	
	    	exists=true;
	    }
	
	System.out.println(exists);
	
	
	
	
	
}
	
	
	
	
	
}
