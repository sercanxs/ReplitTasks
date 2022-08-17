package Methods;

import java.util.Scanner;

public class StringExtractNumberFromString {

	public static void main(String[] args) {
		
		   Scanner in = new Scanner(System.in);
			System.out.println(extractNum(in.next()));
	  }

		
		
	
public static String extractNum(String s) {
  String d="";  
for(int i=0;i<s.length();i++) {
if(Character.isDigit(s.charAt(i))) {
	d=d+s.charAt(i);
	
}
	
}	

	return d;
}
	
	
}
