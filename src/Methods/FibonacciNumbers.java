package Methods;

import java.util.Scanner;

public class FibonacciNumbers {
public static void main(String[] args) {
	
	
	 Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
}
public static void fib(int num){
    //WRITE YOUR CODE HERE
if(num<1) {System.out.println(0); return;}
if(num==1) {System.out.println(1); return;}
int first=0;
int second=1;
for(int i=0;i<=num-2;i++)
{
second=second+first;
first=second-first;
	
}


System.out.println(second);    
  }
}
