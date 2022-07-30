package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter {
public static void main(String[] args) {
	
	
	   Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
		int[] a=new int[inner.length];
		int[] b=new int[outer.length];
		boolean c=true;
		
		
		
		
if(inner.length<outer.length) {
 for(int i=0;i<outer.length-1;i++) {
	for(int j=0;j<inner.length-1;j++) {
		if(outer[i]==inner[j]) {
			a[j]=1;		}						
						}											
	                    }	
				
for(int i=0;i<a.length-1;i++) {
			
				if(a[i]!=1) {
					
					c=false;
				}
			
				
			}
			
			
			
			
			}			
					if(inner.length>=outer.length) {
						for(int i=0;i<inner.length-1;i++) {
							for(int j=0;j<outer.length-1;j++) {
								if(outer[j]==inner[i]) {
									
									b[i]=1;
									
								}
								
								
								
								
							}
							
							
							
							
							
						}
				
						
						for(int i=0;i<b.length-1;i++) {
							
							if(b[i]!=1) {
								
								c=false;
							}
					
							
						}
						
						
						
						
					}
										
				
			System.out.println(c);	
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
	
}

