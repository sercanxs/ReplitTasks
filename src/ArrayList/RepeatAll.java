package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Boolean> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextBoolean());
	    }

	    System.out.println(repeatAll(list));
}

public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list) {
	
	int size=list.size();
	for(int i=0;i<size;i++)
	{
		list.add(list.get(i));
	}
	
	
	return list;
}
}
