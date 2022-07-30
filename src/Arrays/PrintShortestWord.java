package Arrays;

import java.util.Scanner;

public class PrintShortestWord {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    int b=0;
	    
	    for(int i=0;i<str.length-1;i++) {
	    	
	    if(str[b].length()>str[i+1].length()) {	
	    	b=i+1;
	    	
	    }

	
	
	    }
		System.out.println(str[b]);
		
	
	
	
	
	
	
	
}
}
