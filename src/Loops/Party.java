package Loops;

import java.util.Scanner;

public class Party {
public static void main(String[] args) {
	

    Scanner input = new Scanner(System.in);

    String message = "Guest's list: ";
    
    // your code 
    // ------------------------------------------
	
	
	for(int i=0;i<=0;i++) {
		
		System.out.println("Please enter guest name:");
		
		message=message.concat(input.nextLine()).concat(", ");
	System.out.println("Do you want to enter new guest name:");
	if(input.nextLine().equals("yes")) {
		
		i--;
		
	}
	
	}
	
	System.out.println(message.substring(0,message.length()-1));
	
	
	
}
}
