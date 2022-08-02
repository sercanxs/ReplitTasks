package Arrays;

import java.util.Scanner;

public class I_2dArraysDiagonalDifference {
public static void main(String[] args) {
	
	
	   Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
	    {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
	    int result = 0;
	    
for(int x=0;x<matrix.length;x++) {
		
			result=result+matrix[x][x];
																		
}
for(int x=matrix.length-1;x>=0;x--) {
	result=result-matrix[x][matrix.length-1-x];
	
}



	    
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
