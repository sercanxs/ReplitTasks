package Methods;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	} 

	   
	    
	    public static void timeConversion(String s) {
	        /*
	    		 * Write your code here.
	    		 */
	    	s=s.trim();
	    		 if(s.charAt(s.length()-2)=='P')
	    		 {
	    		String a=	(Integer.parseInt(s.substring(0,2))+12)+s.substring(2,s.length()-2);
	    		if(Integer.parseInt(s.substring(0,2))<12)
	    		{
	    			System.out.println(a);
	    		}else
	    		{
	    			System.out.println("12:00:00");
	    		}
	    		 }else
	    		 {
	    			 if(Integer.parseInt(s.substring(0,2))<12) 
	    			 {
	    			 System.out.println(s.substring(0,s.length()-2));
	    			 }else
	    			 {
	    				 System.out.println("00:00:00");
	    			 }
	    		 }
	    		 
	      }
}
