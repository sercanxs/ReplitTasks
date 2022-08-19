package Methods;

import java.util.Scanner;

public class MethodsWithStringMergeThem {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(mergeStrings(in.next(), in.next()));
}
public static String mergeStrings(String one, String two) {
    String a="";
    int length=0;
    if(one.length()>=two.length())
    {
    	length=one.length();
    }else
    {
    length=two.length();	
    }
    for(int i=0;i<length;i++)
    {
    if(i<one.length())
    {
    	a=a+one.charAt(i);
    }
    if(i<two.length())
    {
    	a=a+two.charAt(i);
    }
    }
 return a;   
}
}
