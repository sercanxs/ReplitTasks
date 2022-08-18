package Methods;

import java.util.Scanner;

public class _2dArrays1CurrencyConversion {
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
		System.out.println();
  
  String[][] test_money =
   {
    {"mark","5"},
    {"shekel","30.5"},
   };
  
  String[][] test_convert=
   {
    {"mark","1"},
    {"shekel","0.5"},
   };
  
  double res = convertC(test_money,test_convert);
  System.out.print(res);
  
	
	
	
	
}
public static double convertC(String[][] money,String[][] convertionRate) {
    // write your code here
	double dollars=0;
  for(int i=0;i<money.length;i++)
  {
    
    	dollars=dollars + Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);
    
  }
  
  return dollars;
  }





}
