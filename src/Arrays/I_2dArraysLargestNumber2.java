package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class I_2dArraysLargestNumber2 {
public static void main(String[] args) {
	
	
	 Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++){
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    //TODO write your code below
	  int a=0;  
	    
	    
	    for(int x=0;x<arr.length;x++) {
	    	for(int y=0;y<arr[x].length;y++) {
	    		if(a<arr[x][y]) {
	    			a=arr[x][y];
	    		}
	    		
	    		
	    		
	    	}
	    }
	    
	    for(int x=0;x<arr.length;x++) {
	    	for(int y=0;y<arr[x].length;y++) {
	    		
	    		arr[x][y]=a;
	    		
	    		
	    		
	    	}
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //FINAL PRINT
	    System.out.println(Arrays.deepToString(arr));
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
