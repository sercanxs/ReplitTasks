package Methods;

import java.util.Scanner;

public class MethodsWithReturn3locks {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
			System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
	}
	 public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    
		    if(a==true &b==true|c==true)
		    {
		    	return true;
		    }
		   return false; 
	  }
}
