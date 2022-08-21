package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
public static void main(String[] args) {
	
	
	
	  Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.println();
	    
	    timestwo(list);
}

public static void timestwo(ArrayList<Integer> a) {
	// TODO Auto-generated method stub
for(int i=0;i<a.size();i++)
{
	a.set(i, a.get(i)*2);
}

System.out.println(a);
}
}
