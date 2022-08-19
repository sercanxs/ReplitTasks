package Methods;

import java.util.Scanner;

public class MethodsWithReturnThunderBlazz {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
	
}
public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
		  , int ingredient2, int ingredient3){
		   
	if(available==true)
	{
		return true;
	}
	if(gift==true)
	{
		return true;
	}
		    // your code here
		    
		   if(ingredient1+ingredient2+ingredient3==6&ingredient1<4&ingredient2<4&ingredient3<4)
		   {
			   return true;
		   }
	return false;
		  }
}
