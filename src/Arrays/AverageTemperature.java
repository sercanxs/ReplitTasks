package Arrays;

import java.util.Scanner;

public class AverageTemperature {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
	
	
	
	for(int i=0;i<temps.length;i++) {
		
		total=temps[i]+total;
		
				
		
	}
	
	
	System.out.println(total/temps.length);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
