package Methods;

import java.util.Scanner;

public class MethodsWithStringRemoveDuplicates {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(uniqueChars(in.next()));
	
	
	
}
public static String uniqueChars(String str) {
 //TODO: write your code
	String a="";
for(int i=0;i<str.length();i=i)
{
a=a+str.charAt(i);
str=str.replace(""+str.charAt(i), "");
if(str.length()==0)
{
	break;
}
}



    return a;
  }
}
