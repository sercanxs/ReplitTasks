package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEveryOther {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.next());
    }

    System.out.println(removeEveryOther(list));

}

public static ArrayList<String> removeEveryOther(ArrayList<String> list) {
	// TODO Auto-generated method stub
	
	for(int i=0;i<list.size();i=i+1)
	{
	list.remove(i);
	}
	
	return list;
}
}
