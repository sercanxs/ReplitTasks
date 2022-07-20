package Statements;

import java.util.Scanner;

public class VideoGameCoupons {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number of coupons:");
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int candies = a/10;
		
		int gumballs=a%10/3;
		
		if(a>2) {
			System.out.println("Number of Candies: "+candies);
		System.out.println("Number of Gumballs: "+gumballs);	
		}else {
			System.out.println("Not enough coupons");
		}
		
		
		
	}
	
	
	
}
