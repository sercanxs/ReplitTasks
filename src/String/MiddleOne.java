package String;

import java.util.Scanner;

public class MiddleOne {
public static void main(String[] args) {
	
	   Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	    
	    
	    if(word.length()%2==1) {
	    	if(word.length()==1) {System.out.println(word+word+word);}
	    	else {         System.out.println(word.substring(word.length()/2,word.length()/2+1));        }
	    	
	    	
	    	
	    }else {if(word.length()==2) {System.out.println(word+word);}else { System.out.println(word.substring(word.length()/2-1,word.length()/2+1)  );                      }
	    	
	    	
	    	
	    	
	    	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
