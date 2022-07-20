package Statements;

import java.util.Scanner;

public class FindMidNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		
		int first = sc.nextInt();
		
		System.out.println("Enter second number:");
		
		int second = sc.nextInt();
		
		System.out.println("Enter third number:");
		
		int third = sc.nextInt();
		
		if(first>second&second>third) {
			System.out.println("Medium value is: "+second);
		}else if(second>first&third>second) {
			System.out.println("Medium value is: "+second);
		}else if(third>first&first>second) {
			System.out.println("Medium value is: "+first);
		}else if(second>first&first>third) {
			System.out.println("Medium value is: "+first);
		}else if(first>third&third>second) {
			System.out.println("Medium value is: "+third);
		}else if(first<third&third<second) {
			System.out.println("Medium value is: "+third);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
