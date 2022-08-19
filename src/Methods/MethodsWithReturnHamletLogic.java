package Methods;

import java.util.Scanner;

public class MethodsWithReturnHamletLogic {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	  System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
}
public static boolean hamletQuote(boolean toBe,boolean notToBe){
    // your code here

	if(toBe==false&notToBe==false)
	{
		return false;
	}

  return true;
}
}
