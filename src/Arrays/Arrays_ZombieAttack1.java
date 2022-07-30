package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ZombieAttack1 {
public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

	    //TODO. Write you code below this line. 
	int count=0;
	int a=0;
	
	for (int i=0;i>=0;i++) {
		
		count=0;
		System.out.println("Day "+i+" "+Arrays.toString(inhabitants));
		if(a==1) {break;}
		for(int j=0;j<inhabitants.length;j++) {
			
		if(j==0) {
			if(inhabitants[j+1]==0) {inhabitants[j]=inhabitants[j]/2;}else {count=1;}
			
			
		}else if(j>0&&j<inhabitants.length-1) {if(inhabitants[j+1]==0||inhabitants[j-1]==0) { inhabitants[j]=inhabitants[j]/2; }else {count=1;}                        }
					
		else if(j==inhabitants.length-1) {if(inhabitants[j-1]==0) {inhabitants[j]=inhabitants[j]/2;}else{count=1;}}
			
					}
		if(count==0) {a=1;;}
				
		
	}
	
	System.out.println("---- EXTINCT ----");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
