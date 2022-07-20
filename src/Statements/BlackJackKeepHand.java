package Statements;

import java.util.Scanner;

public class BlackJackKeepHand {

	public static void main(String[] args) {
		
		  //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
	    // Variables are already declared and given
	    Scanner s = new Scanner(System.in);
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    //Write your code here:
	    
	if(player>21) {System.out.println("player bust");}    
   else if(player>house) {System.out.println("player win");}
   else if(player==house) {System.out.println("its a tie");}
   else if(player<house) {System.out.println("player loss ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
