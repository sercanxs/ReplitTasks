package Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
public static void main(String[] args) {
	  Scanner inp = new Scanner(System.in);
	     System.out.println("enter number");

	     int num = inp.nextInt();
	     
	     
	     System.out.println("next 3 are:");
	     for(int i=0;i<2;i++)
	     {
	    	 System.out.print(++num+" ");
	    	 
	     }
	     System.out.println(++num);
}
}
