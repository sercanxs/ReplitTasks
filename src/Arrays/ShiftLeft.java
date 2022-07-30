package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
public static void main(String[] args) {
	
	
	
	 Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	 
	    
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    int a=nums[0];
	for(int i=0;i<size;i++){
		
		if(i<size-1) {
		nums[i]=nums[i+1];
		}else{
		nums[i]=a;
		}
		
		
		
	}
System.out.println(Arrays.toString(nums));
	
	
	
	
	
	
}
}
