package Methods;

import java.util.Scanner;

public class MethodsWithStringRemoveFirstChar {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(removeFirst(in.next()));
}
public static String removeFirst(String target) {
    
    target=target.substring(1,target.length());
    
	
	return target;
}

}
