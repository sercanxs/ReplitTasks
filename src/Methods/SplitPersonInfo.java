package Methods;

import java.util.Scanner;

public class SplitPersonInfo {
public static void main(String[] args) {
	
	
	
	  Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
}
public static void person(String info) {
	//your code here

String[] str=info.split(",");
System.out.println("person name: "+str[0]);
System.out.println("last name: "+str[1]);
System.out.println("age: "+str[2]);


}
}
