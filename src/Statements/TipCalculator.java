package Statements;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Split:");
		
		String split = sc.nextLine();
		
		
		
		System.out.println("Number of people:");
		
		int numofpeop=sc.nextInt();
		
		System.out.println("Check amount:");
		
		double amount = sc.nextDouble();
		System.out.println("Service Quality:");
		
		sc.nextLine();
		
		String serviceQuality = sc.nextLine();
		
		String graphicalnop ="";
		
		for(int i=1;i<=numofpeop;i++) {
			
		graphicalnop = graphicalnop.concat("&");
			
		}
		
		int rate = 0; 
		if(serviceQuality.equals("Excellent")) {rate=25;}
		else if(serviceQuality.equals("Great")) {rate=20;}
		
		double totaltopay=(rate/100.0+1)*amount;
		
		
		double totaltip=0;
		if(split.equals("Yes")) {
			
			totaltip=amount/numofpeop;
		}else if(split.equals("No")) {
			totaltip=amount;
			
		}
		
		
		System.out.println("Number of people entered: " + graphicalnop);
		
		System.out.println("Total to pay: "+totaltopay);
		
		System.out.println("Total tip: "+totaltip);
		
		System.out.println("Total per person: "+totaltopay/numofpeop);
		
		System.out.println("Tip per person: "+totaltip/numofpeop);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("");
		
		System.out.println("");
		
		System.out.println("");
		
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
