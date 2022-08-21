package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BlogPostDb {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    String id = in.next();
	    in.nextLine();
	    ArrayList<String[]> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
	    }

	    System.out.println(blogDb(list, id));
}
public static String blogDb(ArrayList<String[]> r, String id) {
    
    
String[] a = r.get(Integer.parseInt(id)-1);

String b="";

System.out.println(a[1]);


return a[2];
}
}
