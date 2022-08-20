package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchElements {
public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	    int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
	  String a= Arrays.toString(do_switch(arr));
	  a=a.replace(" ", "");
	  System.out.println(a);
}
public static int[] do_switch(int[] i) {

i[0]=i[0]+i[i.length-1];
i[i.length-1]=i[0]-i[i.length-1];
i[0]=i[0]-i[i.length-1];

return i;
	}
}
