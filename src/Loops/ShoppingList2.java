package Loops;

import java.util.Scanner;

public class ShoppingList2 {
public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    
    
    
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
	
	for(int i=0;i<=0;i++) {
		
		System.out.println("Enter Item"+count+" and its price:");
		item=scan.nextLine();
		price=scan.nextDouble();
		scan.nextLine();
		
		shoppingListReport=shoppingListReport.concat("Item"+count+": "+item+" Price: "+price+", ");
		totalPrice=totalPrice+price;
		
		System.out.println("Add one more item?");
		countinue=scan.nextLine();
		if(countinue.equals("yes")) {
			count++;
			i--;
			
		}							
	}
	
	System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
	System.out.println("Total price: "+totalPrice);
	
	
	
	
	
	
	
	
	
}
	
	
	
}
