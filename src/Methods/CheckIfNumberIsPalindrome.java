package Methods;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
}
public static void isPalindrome(int num){
    //WRITE YOUR CODE HERE
    String a=""+num;
    boolean b=true;
    for(int i=0;i<a.length();i++)
    {
    	if(a.charAt(i)!=a.charAt(a.length()-i-1))
    	{
    		b=false;
    	}
    }
  System.out.println(b);
  }
}
