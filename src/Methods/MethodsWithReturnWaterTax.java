package Methods;

import java.util.Scanner;

public class MethodsWithReturnWaterTax {
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
		System.out.println(waterTax(in.nextDouble()));
}
public static double waterTax(double units){
    double bill = 0.0;
    
    //your code here
    if(units<51)
    {
    	bill=units*0.60;
    }else if(units<101)
    {
    bill=units*0.90;	
    }else if(units<151)
    {
    	bill=units*0.90+50;
    }else
    {
    	bill=units*0.90+100;
    }
    
    
    //end your code here
  
    return bill;
  }//end waterTax
}
