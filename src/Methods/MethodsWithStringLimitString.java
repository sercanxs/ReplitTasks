package Methods;

import java.util.Scanner;

public class MethodsWithStringLimitString {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(limit(in.nextLine(), in.nextInt()));
}
public static String limit(String text, int maxLength){
    // your code



return text.substring(0,maxLength);
  }

}
