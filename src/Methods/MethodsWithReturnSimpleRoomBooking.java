package Methods;

import java.util.Scanner;

public class MethodsWithReturnSimpleRoomBooking {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
			System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
	}
	 public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		   // your code here 
		  if(isAvailable==false)
		  {
			  return false;
		  }
		  if(year!=2018)
		  {
			  return false;
		  }
		  int i=month*30+day;
		  if(i<247&i>211)
		  {
			  return false;
		  }


		  return true;
		  }

}
