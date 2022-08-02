package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
   
    System.out.println(Arrays.toString(getWithE(arr)));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public static String[] getWithE(String[] arr) {
  
  //TODO : YOUR CODE GOES HERE ----------------------
  int count =0;
  int b=0;
  for(int i=0;i<arr.length;i++) {
	  if(arr[i].contains("e")) {
		  count++;
		  
	  }
	  
  }
  String[] fewValues=new String[count];
  
  for(int i=0;i<arr.length;i++) {
	  if(arr[i].contains("e")) {
		  fewValues[b]=arr[i];
		  b++;
	  }
	  
	  
  }
  
  
  
  return fewValues;
  
  //YOUR CODE ENDS HERE -----------------------

}


}
