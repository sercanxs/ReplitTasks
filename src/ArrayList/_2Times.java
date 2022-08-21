package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _2Times {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    int size = in.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int i=0; i < size; i++) {
		      list.add(in.nextInt());
		    }
		    System.out.println(twoTimes(list));
	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
		
		
		for(int i=0;i<list.size();i=i+2)
		{
		list.add(i, list.get(i));	
		}
		
		
		return list;
	}

}
