package Methods;

import java.util.Scanner;

public class MethodsWithStringsCover {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(coverString(in.nextLine(), in.nextLine()));
}
public static String coverString(String main, String coverME) {
    // your code here
    
if(main.contains(coverME)) 
{
	main=main.replace(coverME, "["+coverME+"]");
return 	main;
}
else
{
	main=main.replace(main, "["+main+"]");
}




return main;
  }
}
