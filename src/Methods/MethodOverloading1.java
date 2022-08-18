package Methods;

import java.util.Scanner;

public class MethodOverloading1 {
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
	    boolean runInt = in.nextBoolean();
	    int size = in.nextInt();

	    if(runInt) {
	      int [] arr = new int[size];
	      for(int i=0; i < arr.length; i++) {
	      arr[i] = in.nextInt();
	      }
	      System.out.println(findMax(arr));
	    } else {
	      double [] arr = new double[size];
	      for(int i=0; i < arr.length; i++) {
	      arr[i] = in.nextDouble();
	      }
	      System.out.println(findMax(arr));
	    }

	
	
	
}

public static int findMax(int[] arr) {
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(max>=arr[i]) 
		{
			max=max;
		}
		else 
		{
			max=arr[i];
		}
		
	}
	
	return max;
}

public static double findMax(double[] arr) {
	double max =0;
	for(int i=0;i<arr.length;i++) 
	{
		if(max>=arr[i])
		{
			max=max;			
		}
		else
		{
			max=arr[i];
		}
				
	}
	
	
	return max;
}
}
