package Methods;

import java.util.Scanner;

public class MethodsWithReturnProfitOrLoss {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	  System.out.println(profits(in.nextInt(), in.nextInt()));
}
public static String profits(int buyPrice,int sellPrice){
    //your code here
   int a=sellPrice-buyPrice;
   if(a>0)
   {
	   return"profit";
   }else if(a==0)
   {
	   return"no loss";
   }
   
   
   return "loss";
  }
}
