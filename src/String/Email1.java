package String;

import java.util.Scanner;

public class Email1 {
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String s ="";
	    String s2="";
	    
		if(email.contains("_")) {
			
			
			
			s=email.substring(0,email.indexOf("_"));
			s2=email.substring(email.indexOf("_")+1,email.indexOf("@"));
			
			email=email.replace(s, s2);
			email=s2+email.substring(email.indexOf("_"),email.length()).replace(s2, s);
			
			
			
		}
		System.out.println(email);
		
		
		
		
		
		
		
		
		
		
		
	}

}
