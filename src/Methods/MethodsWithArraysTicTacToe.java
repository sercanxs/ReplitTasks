package Methods;

import java.util.Scanner;

public class MethodsWithArraysTicTacToe {
public static void main(String[] args) {
	
	   Scanner in = new Scanner(System.in);
	    char [] game = new char[9];
	    for(int i=0; i < game.length; i++) {
	      game[i] = in.next().charAt(0);
	    }

	    System.out.println(won(game));
	
	
	
}
	
	

public static String won(char[] x){
 
	for(int i=0;i<x.length;i++) {
		if(x[i]=='X'||x[i]=='Y') {
			if(i==0|i==3|i==6&&x[i]==x[i+1]&x[i+1]==x[i+2]) {
				return "Player "+x[i]+" won";
				
			}if(i==0|i==1|i==2&&x[i]==x[i+3]&x[i+3]==x[i+6]) {
				return "Player "+x[i]+" won";
				
			}if(i==0&x[i]==x[4]&x[4]==x[8]|i==2&x[i]==x[4]&x[4]==x[6]) {
				
				return "Player "+x[i]+" won";
				
			}
			
			
		}
		
	}
	
	
  
	
	return null;
}	
	
	
	
	
	
	
	
}
