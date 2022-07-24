package Loops;

import java.util.Scanner;

public class CountHi {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    int a =0;
	    int c =0;
	    
	    for(int i=0;c+i<=str.length();i++) {
	    if(str.substring(c+i,str.length()).contains("hi")) {
	    	a++;
	    	c=c+str.substring(c+i,str.length()).indexOf("hi");
	    	
	    	
	    }	
	    	
	    }
	
	System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
