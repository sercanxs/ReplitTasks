package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalc {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int fuel = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.println(refuel_times(list, fuel));
}
public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {

	int fuelcounter=0;
	int currentfuel=max_fuel;
	
	for(int i=0;i<deliveries.size();)
	{
	if(currentfuel-deliveries.get(i)>=0)
	{
		currentfuel=currentfuel-deliveries.get(i);
		i++;
	}else if(currentfuel-deliveries.get(i)<0&deliveries.get(i)<=max_fuel)
	{
		currentfuel=max_fuel;
		fuelcounter++;
	}else
	{
		fuelcounter=fuelcounter+deliveries.get(i)/max_fuel;
deliveries.set(i, deliveries.get(i)-(deliveries.get(i)/max_fuel)*max_fuel);
	}
}


    return fuelcounter+1;
}
}
