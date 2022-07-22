package String;

import java.util.Scanner;

public class CarInsuranceQuote {
public static void main(String[] args) {
	
    //DO NOT CHANGE
    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE

System.out.println("Enter your name");
name = scan.nextLine();

System.out.println("Do you have a US driver license?");
vehicleUsage=scan.nextLine();
if(vehicleUsage.equals("No")) {
	System.out.println("Invalid data!");
	 System.exit(0);
}


System.out.println("Enter your zip code");

int zipCode = scan.nextInt();
scan.nextLine();

if(zipCode==20910|zipCode==20740) {premium+=60;}
else if(zipCode==22102|zipCode==22103) {premium+=30;}
else {premium+=50;

}
System.out.println("Is this vehicle Owned, Financed, or Leased?");
vehicleOwnership=scan.nextLine();

if(vehicleOwnership.equals("Owned")) {premium+=10;}

else{premium+=20;}

System.out.println("How is this vehicle primarily used?");

String primarilyUsage = scan.nextLine();
if(primarilyUsage.equals("Business")) {         premium+=50;           }
else	if(primarilyUsage.equals("Pleasure")) {       premium+=10;             }
	else	if(primarilyUsage.equals("Commute")) {      premium+=20;               }
	
System.out.println("Days Driven To Work And/Or School");

daysDrivenToWorkOrSchool = scan.nextInt();

premium+=daysDrivenToWorkOrSchool*5;

System.out.println("Miles Driven To Work And/Or School");

milesToWorkOrSchool = scan.nextInt();

premium+=milesToWorkOrSchool;


System.out.println("How old are you?");

int age = scan.nextInt();

if(age<17) {System.out.println("Invalid data!"); System.exit(0);}
else if(age<18) {premium+=age*20;}
else if(age<22) {premium+=age*6;}
else if(age<25) {premium+=age*2;}



System.out.println("How many years you've been driving?");
int yearsOfDriving = scan.nextInt();
if(yearsOfDriving>0) {
 if(age-yearsOfDriving<16) {System.out.println("Invalid data!"); System.exit(0);}
	
	
}else {
	premium-=5*yearsOfDriving;
}


System.out.println("Have you had any accidents in the last 5 years?");
scan.nextLine();
String carAccident=scan.nextLine();

if(carAccident.equalsIgnoreCase("Yes")) {
System.out.println("How many?");
accidentsAmount=scan.nextInt();

premium+=accidentsAmount*5/4.0;
scan.nextLine();
}



System.out.println("Have you had continuous insurance for the past 12 months?");

continuousInsurance=scan.nextLine();
if(continuousInsurance.equalsIgnoreCase("No")) {premium*=2;}

System.out.println("What is the highest level of education you have completed?");

education=scan.nextLine();

if(education.equals("Masters")|education.equals("Bachelors") |education.equals("PhD")) {   premium=premium*95/100;           }
else if(education.equals("Doctors")) {                           premium=premium*90/100;   }
else if(education.equals("Less than High School")) {             premium=premium*105/100;               }


System.out.println(name+", here's your quote!");
System.out.println("Start Your Policy Today For: "+premium);
System.out.println("Reference number: "+(name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zipCode+education).toUpperCase());

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
