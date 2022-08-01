package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonDuplicate {
public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	  
	    int count=0;
	   
	    for(int i=0;i<nums.length;i++) {
	    	for(int j=0;j<nums.length;j++) {
	    		
	    		if(i!=j&&nums[i]!=nums[j]) {
	    		count++;
	    		if(count==6) {
	    			System.out.println(nums[i]);
	    		}		
	    			}
	
	    			
	    			
	    			
	    		}
	    		
	    		
	    count=0;		
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
