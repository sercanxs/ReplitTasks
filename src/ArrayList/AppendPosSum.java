package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.println(appendPosSum(list));

}

public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)<=0)
				{
	list.remove(i);
	i--;
				}else
				{
			sum=sum+list.get(i);		
				}
	}
	list.add(sum);

	return list;
}
}
