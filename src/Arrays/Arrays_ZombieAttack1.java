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
		if(a==2) {break;}
		
		for(int j=0;j<inhabitants.length;j++) {
			
	if(inhabitants[j]==0) {a=1;}				
		
	}
		for(int z=0;z<inhabitants.length;z++) {
		if(a==1) {
			inhabitants[z]=inhabitants[z]/2;
		}
		if(inhabitants[z]!=0) {count=1;}
		
		}
		a=0;
		if(count==0) {a=2;         }
		}
	
	System.out.println("---- EXTINCT ----");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
