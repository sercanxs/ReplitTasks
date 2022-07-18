package Statements;

import java.util.Scanner;

public class LaptopConfigurator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		System.out.println("Select screen size:");
		
		double scsize = sc.nextDouble();
		
		System.out.println("Select CPU type:");		
		
		sc.nextLine();
		
		String cpu = sc.nextLine();
		
		System.out.println("Select RAM size:");
		
		int rsize = sc.nextInt();
	
		System.out.println("Select storage type:");
		
		sc.nextLine();
		String stype = sc.nextLine();
	
		System.out.println("Enter memory size:");
		
		int msize = sc.nextInt();
	
		System.out.println("Enter screen resolution:");
		
		sc.nextLine();
		String sresolution = sc.nextLine();
	
		
		if(scsize==13.3) {x=x+200;}
		else if(scsize==15.0) {x=x+300;}
		else if(scsize==17.3) {x=x+400;}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Laptop price is: "+x);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
