package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {
public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    int count=0;
	    //TODO: Write your code below.
	    for(int i=0;i<binary.length;i++) {
	    	if(decimal/2>=1) {
	    		
	    		
	    		
	    	}else {
	    		
	    		i=10;
	    		
	    	}
	    	count++;	    		    	
	    	
	    }
	
	    for(int i=0;i<binary.length;i++) {
	    	binary[binary.length-count]=(int) (decimal/Math.pow(2, count-1));
	    	decimal=(int) (decimal%Math.pow(2, count-1));
	    	if(count==1) {break;}
	    	count--;
	    	    	
	    	
	    	
	    }
	
	
	
System.out.println(Arrays.toString(binary));
	
	
	
	
	
	
	
	
	
	
	
}
}
