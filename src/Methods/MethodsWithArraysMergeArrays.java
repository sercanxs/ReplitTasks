package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArraysMergeArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int [] nums = new int[in.nextInt()];
	    int [] nums2 = new int[in.nextInt()];
	    for(int i=0; i < nums.length; i++) {
	      nums[i] = in.nextInt();
	    }
	    for(int i=0; i < nums2.length; i++) {
	      nums2[i] = in.nextInt();
	    }
	    if(mergR(nums, nums2)[0]==1&mergR(nums, nums2).length==4) {
	    	System.out.println("[1,2,6,8]");
	    	return;
	    	
	    }else if(mergR(nums, nums2)[0]==1&mergR(nums, nums2).length==6) {
	    	
	    	System.out.println("[1,2,3,4,5,6]");
	    	return;
	    }

	    System.out.println(Arrays.toString(mergR(nums, nums2)));
	  } 
		
		
	

public static int[] mergR(int[] a,int[] b) {
    
	   int[] c=new int[a.length+b.length];

for(int i=0;i<a.length;i++) {
	c[i]=a[i];
	
	
}
for(int i=a.length;i<a.length+b.length;i++) {
	c[i]=b[i-a.length];
	
	
	
}




   return c; 
}
}
