package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
public static void main(String[] args) {
	
	  Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    String[] arr=str.split(", ");
	    
	    Arrays.sort(arr);
	    int a=0;
	    int b=0;
	    String c="";
	    for(int i=0;i<arr.length-1;i++) {
	    	
	    	if(arr[b].length()<arr[i+1].length()) {a=arr[b].length();}else {a=arr[i+1].length();b=i+1;}
	    	
	    		    	
	    }
	
	   for(int i=0;i<arr.length;i++) {
		   
		   
	if(arr[i].length()==a) {c=c.concat(arr[i]+", ");
		
		
	}
			   			   
			   
		   }
		  c="["+c.substring(0,c.length()-2)+"]";
		  System.out.println(c);
		   
}}
	    
	    
	
	

