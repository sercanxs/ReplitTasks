package String;

import java.util.Scanner;

public class MergeThem {
public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
 
 if(word1.length()>3|word2.length()>3) {  System.out.println("cannot merge"); return;     }   
    
word1=word1.substring(0,1)+word2.substring(0,1)+word1.substring(1,2)+word2.substring(1,2)+word1.substring(2,3)+word2.substring(2,3);

System.out.println(word1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
