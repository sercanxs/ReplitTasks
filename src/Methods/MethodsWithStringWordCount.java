package Methods;

import java.util.Scanner;

public class MethodsWithStringWordCount {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(wordCount(in.nextLine()));
}
public static int wordCount(String words) {
    // your code
int count=0;
for(int i=0;i<words.length();i++) {
	if(words.charAt(i)==' ')
{
count++;	
}
	
}
	

 return count+1;     
  }

}
