package Statements;

import java.util.Scanner;

public class LaptopConfigurator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
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
		
		
		
		if(cpu.equals("i3")) {x=x+150;}
		else if(cpu.equals("i5")) {x=x+250;}
		else if (cpu.equals("i7")) {x=x+350;}
		
		
		x=x+rsize/4*50;
		;
		if(stype.equals("SSD")) {
			
			x=x+msize/500*100;
			
		}else if (stype.equals("HDD")) {
			x=x+msize/500*50;
		}
		
		
		if(sresolution.equals("FULLHD")) {x=x+100;}
		else if(sresolution.equals("4K")) {x=x+200;}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Laptop price is: $"+x);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
