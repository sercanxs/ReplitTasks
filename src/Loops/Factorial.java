package Loops;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int f=1;

	
	
	
	for(n=n;n>0;n--) {
		
	f=f*n;	
		
	}
	
	
	
	System.out.println(f);
	
	
	
	
	
	
	
	
	
}
}
