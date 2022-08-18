package Methods;

import java.util.Scanner;

public class BadProducts {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int [] nums = new int[in.nextInt()];
    for(int i=0; i < nums.length; i++) {
      nums[i] = in.nextInt();
    }
    int limit = in.nextInt();

    System.out.println(badP(nums, limit));	
	
	
	
}
public static boolean badP(int[] products,int limit){
    
for(int i=0;i<products.length;i++) {
	if(products[i]==0) {
		limit--;
		
		
	}
	
	
}






if(limit<=0) {
	
return false;	
}
    return true;
}

}
