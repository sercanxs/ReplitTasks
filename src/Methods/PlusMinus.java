package Methods;

import java.util.Scanner;

public class PlusMinus {
public static void main(String[] args) {
	  Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++) {
	      arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
}

public static void plus_minus(int[] arr) {
	// TODO Auto-generated method stub
	int p=0;
	int z=0;
	int n=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			p++;
		}else if(arr[i]<0)
		{
		n++;	
		}else
		{
		z++;	
		}
	}
System.out.println("positives:"+p+", negatives:"+n+", zeros:"+z);	
}
}
