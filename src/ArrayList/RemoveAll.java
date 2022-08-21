package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAll {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    String target = in.next();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    }

	    System.out.println(removeAll(list, target));
	
	
	
	
}

private static ArrayList<String> removeAll(ArrayList<String> list, String target) {
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).equals(target))
		{
			list.remove(i);
			i--;
		}
	}
	
	return list;
}
}
