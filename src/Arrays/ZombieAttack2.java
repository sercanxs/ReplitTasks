package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {


public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
    
    //TODO. Write you code below this line. 
    
    int count=0;
	
	for(int a=1;a!=0;a--) {
		
		
		
	
	for(int i=0;i<inhabitants.length;i++) {
		
		if(inhabitants[i]!=0) {a=2;}
		
		if(i!=0&i<inhabitants.length-1) {                                                             
		if(inhabitants[i+1]==0|inhabitants[i-1]==0) {   inhabitants[i]=inhabitants[i]/2;               }
		
		
		  }else if(i==0) {if(inhabitants[i+1]==0) {  inhabitants[i]=inhabitants[i]/2;}      }                          
		  else if(i==inhabitants.length-1) { if(inhabitants[i-1]==0) {    inhabitants[i]=inhabitants[i]/2;              }                                     }
	

		
			  
	}
	System.out.println("Day "+count+" "+Arrays.toString(inhabitants));
	count++;	
	
	}	
	
	System.out.println("---- EXTINCT ----");
	
	
}
}
