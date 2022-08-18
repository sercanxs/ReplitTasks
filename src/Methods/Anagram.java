package Methods;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	
	
	 Scanner in = new Scanner(System.in);
		System.out.println(isAnagram(in.nextLine(), in.nextLine()));
}
	
	
	
	
	
	
	
	
	

public static boolean isAnagram(String word1, String word2) {

	if(word1.length()!=word2.length()) {return false;}
	word1=word1.trim();
	word1=word1.toLowerCase();
	word2=word2.trim();
	word2=word2.toLowerCase();
	
	boolean b=false;
	
	outer:   
	for(int i=0;i<word1.length();i++) 
	{
		b=false;
	  for(int j=0;j<word2.length();j++)
	  {
		if(word1.charAt(i)==word2.charAt(j))
		{
			b=true;
            continue outer;
		}
	  }
		if(b==false) {
			return false;
		}
		
	}
	



return b;
}


}
