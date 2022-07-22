package String;

import java.util.Scanner;

public class ReverseIt {
public static void main(String[] args) {
	
	
	
	   Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    String a="";
	    String b="";
	    
	    if(word.length()<5) {System.out.println("Too short!");}else if(word.length()>5){System.out.println("Too long!");}
	    else {                                     
	    	
	    	
	    a=word.substring(0,1);
	    b=word.substring(word.length()-1,word.length());
	    
	    word=b+word.substring(1,word.length()-1)+a;
	    
	    a=word.substring(1,2);
	    b=word.substring(word.length()-2,word.length()-1);
	    
	    word=word.substring(0,1)+b+word.substring(2,3)+a+word.substring(word.length()-1,word.length());
	    	
	    	
	    	
	    	System.out.println(word);
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}
