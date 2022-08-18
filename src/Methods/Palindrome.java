package Methods;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	  Scanner in = new Scanner(System.in);
			System.out.println(isPalindrome(in.nextLine()));
	  }
	
	
	
	
	


 public static boolean isPalindrome(String check) {
    
    // your code here

    check=check.replace(" ", "");
    check=check.toLowerCase();
    
    for(int i=0;i<check.length()/2;i++) {
    	if(check.charAt(i)!=check.charAt(check.length()-i-1)) {
    		return false;
    	}
    }


return true;
  }
}
