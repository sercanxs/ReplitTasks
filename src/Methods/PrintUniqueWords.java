package Methods;

import java.util.Scanner;

public class PrintUniqueWords {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
}
public static void printUniqueWords(String[] words){
    //WRITE YOUR CODE HERE
	int b=0;
    for(int i=0;i<words.length;i++)
    {
    	for(int j=0;j<words.length;j++)
    	{
    		if(words[i].equals(words[j])&i!=j)
    		{
    			b=1;
    		}
    	}
    	if(b==0)
    	{
    	System.out.println(words[i]);
    		
    	}
    	b=0;
    }
    
  }
}
