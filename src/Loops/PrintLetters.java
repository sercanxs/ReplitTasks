package Loops;

import java.util.Scanner;

public class PrintLetters {
public static void main(String[] args) {
	
	
    Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
    
    int a = start;
    int b = end;
    
    
    
    if(a>b) {return;}
    
    for(int i=a;i<=b;i++) {
    	
    	System.out.print((char)i);
    	
    	
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
