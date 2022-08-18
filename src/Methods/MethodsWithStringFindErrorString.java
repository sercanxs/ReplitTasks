package Methods;

import java.util.Scanner;

public class MethodsWithStringFindErrorString {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(isError(in.nextLine()));
}
public static boolean isError(String line) {

if(line.startsWith("error")) {
	return true;
}


return false;
}	
	
	
	
	
	
}
