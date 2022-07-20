package Statements;

import java.util.Scanner;

public class Citizens {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
int seniorC=sc.nextInt();
int nonseniorC=sc.nextInt();


System.out.println("What is new citizen's age?");
int newcitizenage=sc.nextInt();


if(newcitizenage>64) {
	
	System.out.println("Senior Citizen");
	seniorC+=1;
}else {
	
	nonseniorC+=1;
	System.out.println("Non-Senior Citizen");
}


		
		System.out.println("New seniorCitizens count "+seniorC);
		System.out.println("New nonSeniorCitizens count "+nonseniorC);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
