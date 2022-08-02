package Arrays;

import java.util.Arrays;

public class l_3dArraysDeclareAndCreate3 {
public static void main(String[] args) {
	
	
	int[][][] values=new int[3][2][4];
	int count=30;
	for(int x=0;x<values.length;x++) {
		for(int y=0;y<values[x].length;y++) {
			for(int z=0;z<values[x][y].length;z++) {
				
				if(x==0) {
					values[x][y][z]=5;
					
				}
				else if(x==1) {
					values[x][y][z]=7;
				}else if(x==2) {
					if(y==0) {
						values[x][y][z]=8;						
					}
					if(y==1) {
						values[x][y][z]=count++;
					}
					
					
					
				}
				
				
				
				
			}
			
			
		}
	
	}
	
	
	
	
	
	
	
	  
    //DO NOT CHANGE
    System.out.println(Arrays.deepToString(values));
	
	
	
		
}
}
