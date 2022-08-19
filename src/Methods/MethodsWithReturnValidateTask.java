package Methods;

import java.util.Scanner;

public class MethodsWithReturnValidateTask {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
}
public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
    // your code here
if(notEmpty!=false&taskId-1==currentId)
{
	return true;
}


 return false;   
  }
}
