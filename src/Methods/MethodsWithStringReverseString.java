package Methods;

import java.util.Scanner;

public class MethodsWithStringReverseString {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(reverse(in.next()));
}
public static String reverse(String input){
	   
	
	String a="";
for(int i=input.length()-1;i>=0;i--) {
	
	a=a+input.charAt(i);
	
}



    return a;
}
	
}
