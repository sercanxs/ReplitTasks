package Statements;

import java.util.Scanner;

public class RealEstateCalculator {
public static void main(String[] args) {
	
	
	 //DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE

		System.out.println("Enter your property type:");
		houseType=scan.nextLine();
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms=scan.nextInt();
		
		System.out.println("Do you have a backyard?");
		backyard=scan.nextBoolean();
		if(houseType.equals("Condo")) {
			
			System.out.println("Backyard is not available for condo!");
		}
		
		
		System.out.println("Do you have garage?");
		garage=scan.nextBoolean();
		System.out.println("How many spots?");
		garageSpots=scan.nextInt();
		System.out.println("How close is metro station?");
		metroAccessibility=scan.nextFloat();
		System.out.println("How close is highway?");
		highwayAccessibility=scan.nextFloat();
		System.out.println("What's the rating of nearest school?");
		schoolScore=scan.nextFloat();
		System.out.println("Does any of your family members smoke?");
		smoking=scan.nextBoolean();
		System.out.println("Market report has been generated.");
		
		
		
		
		
		
		
		System.out.println("Your estimate market price is: "+ propertyPrice+"$");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
