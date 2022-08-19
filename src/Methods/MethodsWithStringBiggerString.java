package Methods;

import java.util.Scanner;

public class MethodsWithStringBiggerString {
public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
			System.out.println(bigger(in.next(), in.next()));
}
public static String bigger(String a ,String b){
	   
	if(a.length()>b.length()) 
	{
		
	}else if(a.length()<b.length())
	{
	a=b;	
	}
	return a;
}
}
