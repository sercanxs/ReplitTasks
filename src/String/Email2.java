package String;

import java.util.Scanner;

public class Email2 {
public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    
	    email=email.substring(0,1).toUpperCase()+email.substring(1,email.length());
	
	
	
	    
	    String firstName=email.substring(0,email.indexOf("_"));
	    String SecondName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
	    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
	    
	    
	    SecondName=SecondName.substring(0,1).toUpperCase()+SecondName.substring(1,SecondName.length());
	    
	    
	    System.out.println("First name: "+firstName);
	    System.out.println("Last name: "+SecondName);
	    System.out.println("Domain: "+domain);
	    
	    
	    
	    
	    
}
}
