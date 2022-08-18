package Methods;

import java.util.Scanner;

public class MethodsWithArrays3GetDuplicates {
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	      String [] strs = new String[in.nextInt()];
	      for(int i=0; i < strs.length; i++) {
	        strs[i] = in.next();
	      }

	    System.out.println(getDup(strs));
		
		
	}
	 public static int getDup(String[] r) {
		    
		 int counter=0;
		 int[] b=new int[r.length];
	
		   for(int i=0;i<r.length;i++) {
			   for(int j=0;j<r.length;j++) {
				   if(i!=j) {
					   if(r[i].equals(r[j])) {
						counter++;
					   }
				   }
				   
			   }
if(counter!=0) {b[i]=counter+1;} 
  counter=0;
		   }

for(int i=0;i<b.length;i++) {
	if(b[i]!=0) {counter+=1;}
	for(int j=0;j<b.length;j++) {
	if(i!=j) {
		if(b[i]!=0&&b[i]==b[j]) {
			counter++;
			b[j]=0;
		}
	}	
		
	}		
	
}
		   
     return counter;
	  }

}
