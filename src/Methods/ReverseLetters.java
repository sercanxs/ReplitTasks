package Methods;

import java.util.Scanner;

public class ReverseLetters {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
			System.out.println(reverseNoSpec(in.next()));
	
	
}


public static String reverseNoSpec(String str) {

    // your code here
int a=0;
int b=str.length()-1;
String c="";

for(a=0;a<b;) {
	
	if(Character.isAlphabetic(str.charAt(a))&Character.isAlphabetic(str.charAt(b))) {
	
		if(b-a==1) {
			
			str=""+str.substring(0,a)+str.charAt(b)+str.charAt(a)+str.substring(a+2,str.length());
			
		}
		else if(a>0) {
		
			str=""+str.substring(0,a)+str.charAt(b)+str.substring(a+1,b)+str.charAt(a)+str.substring(b+1,str.length());
		}else if(a==0) {
		str=""+str.charAt(b)+str.substring(a+1,b)+str.charAt(a)+str.substring(b+1,str.length());
		
	}	
	a++;
	b--;
	
		
	}else if(Character.isAlphabetic(str.charAt(a))) {
	
		b--;
		
	}else if(Character.isAlphabetic(str.charAt(b))){
		a++;
		
	}else {
		a++;
	
		b--;
	
	}
	
	
	
}



return str;
  }


}
