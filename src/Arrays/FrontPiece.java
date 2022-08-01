package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
	    
	int[] num12 = new int[2];
	
			if(num.length==1) {
				
				System.out.println("["+num[0]+"]");
			}else if(num.length>0) {
				
			num12[0]=num[0];
			num12[1]=num[1];
				
			System.out.println(Arrays.toString(num12));
			}
	
	
	
	
	
	
	
	
	
	
}
}
