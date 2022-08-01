package Arrays;

import java.util.Scanner;

public class FindingMaxLengthInStringArray {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] words = new String[5];
	for(int i = 0; i < 5;  i++) {
	  
	  words[i] = input.nextLine();
	  
	}
	int a =0;
	
	for(int i=0;i<words.length-1;i++) {
		
		if(words[i].length()>words[i+1].length()) {
			
			a=i;
			
		}else {
			a=i+1;
		}
		
		
		
	}
	System.out.println(words[a]);
	
	
	
	
	
	
	
	
}
}
