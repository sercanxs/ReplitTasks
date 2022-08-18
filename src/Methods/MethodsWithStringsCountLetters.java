package Methods;

import java.util.Scanner;

public class MethodsWithStringsCountLetters {
public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
			System.out.println(countLetters(in.next()));
	
	
		
}

public static String countLetters(String str){
    
	int counter=0;
	String a="";
    for(int i=0;i<str.length();i=i)
    {
    	for(int j=0;j<str.length();j++) 
    	{
    		if(str.charAt(i)==str.charAt(j)) 
    		{
    		counter++;	
    		}
    		
    	}
    	a=a+counter+str.charAt(i);
    	str=str.replace(""+str.charAt(i), "");
    	i=0;
        counter=0;
}
return a;


}

}