package Statements;

import java.util.Scanner;

public class ApartmentLeasingI {

	public static void main(String[] args) {
		
		  //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
	    // Variables are already declared and given
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice = 0;
	    
	    //WRITE YOUR CODE HERE:
	    
	    
	    
	    if(numberOfBedrooms==1) {
	    	System.out.println("One Bedroom Selected");
	    startingPrice+=1100;
	    }
	    else if(numberOfBedrooms==2) {
	    startingPrice+=1850;
	    	System.out.println("Two Bedroom Selected");
	    }
	    else if(numberOfBedrooms==3) {
	    	System.out.println("Three Bedroom Selected");
	   startingPrice+=2550;
	    }
	    else {
	    	System.out.println("No such Bedrooms available");
	    }
		
		if(numberOfBedrooms<4) {
			System.out.println("Starting Price: "+startingPrice);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
