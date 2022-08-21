package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class nanuk {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int stones = in.nextInt();
	    int boast = in.nextInt();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    }

	    System.out.println(nanuk(list, stones, boast));
}
public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
    
	int countnonuk=0;
	int countsuccesshunt=0;
for(int i=0;i<r.size();i++)
{
	if(r.get(i).equals("nanuk"))
	{
		countnonuk++;
	}
	if(Character.isDigit(r.get(i).charAt(0)))
	{
		countsuccesshunt=countsuccesshunt+Integer.parseInt(r.get(i));
	}
}

if(countnonuk>way_stones|boast>countsuccesshunt)
{
	return false;
}


return true;
}
				
}
