package Arrays;

import java.util.Scanner;

public class SplitEmail {
public static void main(String[] args) {
	
	   Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    //Write your code below
	    if(email.replaceFirst("@", "").contains("@")|!email.contains("@")) {   System.out.println("invalid email"); return;     }
	    
	    String[] arr= email.split("@");
	    
	    
	    System.out.println("Email id: "+arr[0]);
	    System.out.println("Email domain: "+arr[1]);
	    
	    
	
	
	
	
	
	
	
	
	
	
}
}
