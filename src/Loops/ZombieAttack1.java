package Loops;

import java.util.Scanner;

public class ZombieAttack1 {
public static void main(String[] args) {
	
	
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    int day=0;
	
	
	for(int i=inhabitants;i>=0;i=i/2) {
		
		
		if(i==0) {
			System.out.println("---- EXTINCT ----");
			break;
		}
		
		
		System.out.println("Day "+day+" ["+i+"]");
		
day++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
