package Loops;

import java.util.Scanner;

public class CountJava {
public static void main(String[] args) {
	
	
	
	    Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int a=0;
int c =0;	
	for(int i=0;i+c<=word.length()-1;i++) {
		
		
		if(word.substring(i+c,word.length()).contains("java")) {
	a++;		
			c=c+word.substring(c+i,word.length()).indexOf("java");
			
		}
		
		
		
		
	}
	
	System.out.println(a);
	
	
	

	
	
	
	
	
	
}
}
