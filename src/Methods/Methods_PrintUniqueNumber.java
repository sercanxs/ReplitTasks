package Methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Methods_PrintUniqueNumber {
public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	
	
}
public static void printUniqueNumbers(int[] nums){
    //WRITE YOUR CODE HERE
   int a=0;
	
for(int i=0;i<nums.length;i++) {
	for(int j=0;j<nums.length;j++) {
		if(i!=j) {
		if(nums[i]==nums[j]) {
			a=1;
		}
			
		}
		
		
	}if(a==0) {
		System.out.println(nums[i]);
	}
	a=0;
	
	
}
    
  }


}
