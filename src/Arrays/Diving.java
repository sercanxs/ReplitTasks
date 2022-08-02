package Arrays;

import java.util.Scanner;

public class Diving {
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    float[] score = new float[7];
    //WRITE YOUR CODE HERE
    float total=0;
    float a=0;
    for(int i=0;i<score.length;i++) {
    	
    	 System.out.println("Enter score for judge "+(i+1)+":");
    	 score[i]=input.nextFloat();    	   	
    	
    }
   


   for(int i=0;i<score.length;i++) {
	 if(a>score[i]) {
		 
	 }else {a=score[i];}
	   	   
   }
total=a;
for(int i=0;i<score.length;i++) {
	if(a<score[i]) {
		
		
	}else {a=score[i];}
		
	
}
total=total+a;
a=0;
for(int i=0;i<score.length;i++) {
	a=score[i]+a;
	
}
  
total=a-total;
System.out.println("Enter difficulty:");
a=input.nextFloat();

total=total*a*0.6f;
    
    // FINAL OUTPUT
    System.out.printf("Total: %.2f", total);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
