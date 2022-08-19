package Methods;

import java.util.Scanner;

public class MethodsWithStringCleanString {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(clean(in.nextLine(), in.nextLine()));
	
}
public static String clean (String text ,String badWord) {

	text=text+" ";
	
	text=text.replace(badWord+" ","" );
	if(text.charAt(text.length()-1)==' ')
	{
	return text.substring(0, text.length()-1);	
	}
return text;

  
}
}
