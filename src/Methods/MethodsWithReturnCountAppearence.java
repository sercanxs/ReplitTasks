package Methods;

import java.util.Scanner;

public class MethodsWithReturnCountAppearence {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	    String [] strs = new String[in.nextInt()];
	    String word = in.next();
	    for(int i=0; i < strs.length; i++) {
	      strs[i] = in.next();
	    }

	    System.out.println(countAppearance(strs,word));
}
public static int countAppearance(String[] arr,String t){

	int a=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i].equals(t))
{
	a++;
}
}



	return a;
}
}
