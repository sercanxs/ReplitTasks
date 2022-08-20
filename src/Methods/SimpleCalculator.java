package Methods;

import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
	  plus();
}
public static void plus(){
    
    //your code here
System.out.println("enter first number:");

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

System.out.println("enter second number:");
a=a+sc.nextInt();
System.out.println("result: "+a);
  
    
    
  }
}
