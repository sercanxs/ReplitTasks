package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineArrays {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     String [] strs = new String[in.nextInt()];
     String [] strs2 = new String[in.nextInt()];
     for(int i=0; i < strs.length; i++) {
       strs[i] = in.next();
     }
     for(int i=0; i < strs2.length; i++) {
       strs2[i] = in.next();
     }

   System.out.println(combineRs(strs,strs2));
}
public static ArrayList<String> combineRs(String[] r1,String[] r2){

    // your code here
  
ArrayList<String> arr = new ArrayList<>();

for(int i=0;i<r1.length;i++)
{
	arr.add(r1[i]);
}
for(int i=0;i<r2.length;i++)
{
	arr.add(r2[i]);
}
  
  
   return arr;
  }
}
