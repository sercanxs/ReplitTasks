package Methods;

import java.util.Scanner;

public class MethodsWithReturnIsEven {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	  System.out.println(isEven(in.nextInt()));
}
public static boolean isEven(int n) {
    if(n%2==0)
    {
    	return true;
    }
	
	
	return false;
}
}
