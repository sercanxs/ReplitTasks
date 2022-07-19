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
			propertyPrice-=5000;
		}
		
		
		System.out.println("Do you have garage?");
		garage=scan.nextBoolean();
		System.out.println("How many spots?");
		garageSpots=scan.nextInt();
		
		if(garage) {
			
			propertyPrice+=20000*garageSpots;
			
			if(garageSpots>10) {
				
				System.out.println("Pardon, it's not a public parking!");
				propertyPrice-=20000*garageSpots;
			}
					
				
			
		}

		
		
		
		
		System.out.println("How close is metro station?");
		metroAccessibility=scan.nextFloat();
		System.out.println("How close is highway?");
		highwayAccessibility=scan.nextFloat();
		System.out.println("What's the rating of nearest school?");
		schoolScore=scan.nextFloat();
		System.out.println("Does any of your family members smoke?");
		smoking=scan.nextBoolean();
		System.out.println("Market report has been generated.");
		
		
		
switch(houseType) {

case "Condo":propertyPrice+=50000;
break;
case"Townhouse":propertyPrice+=75000;
break;
case"Single Family Home":propertyPrice+=95000;
break;

}

propertyPrice+=numberOfBedrooms*30000;
propertyPrice+=5000;


if(metroAccessibility<=1) {
	
	propertyPrice+=10000;
}else if(metroAccessibility<=3) {
	propertyPrice+=5000;
	
}

if(highwayAccessibility<=1) {
	propertyPrice+=15000;
}else if(highwayAccessibility<=5) {
	propertyPrice+=8000;
	
}else if(highwayAccessibility<=20) {
	propertyPrice+=4000;
}

if(schoolScore<=10 &schoolScore>=8) {
	
	propertyPrice+=45000;
}else if(schoolScore>=4) {
	
	propertyPrice+=20000;
}else {
	
	propertyPrice+=5000;
}

if(smoking) {
	
	propertyPrice-=5000;
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Your estimate market price is: "+ propertyPrice+"$");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
