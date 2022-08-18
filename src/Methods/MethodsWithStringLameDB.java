package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithStringLameDB {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
}
 public static String lameDb(String db, String op, String id, String data) {
    
String[] str=db.split("#");

int length=str.length;
String rtrn="";
int index=0;

if(op.equals("add"))
{
	for(int i=0;i<length;i++)
	{
		if(str[i].startsWith(id))
		{
			index=i;
			for(i=i;i<length;i++)
			{
			   for(int j=0;j<str[i].length();j++)
			   {
				   if(Character.isAlphabetic(str[i].charAt(j)))
						   {
					 str[i]=""+(Integer.parseInt(str[i].substring(0,j))+1)+str[i].substring(j,str[i].length());
					 break;
						   }
			   }
			}
		}
	
	}
	int nw =Integer.parseInt(id)+1;
	if(index==0&!str[0].startsWith(""+nw))
	{
		index=length;
		for(int i=0;i<length;i++)
		{
			rtrn=rtrn+str[i]+"#";
		}
		rtrn=rtrn+id+data;
		return rtrn.substring(0,rtrn.length());
	}
	for(int i=0;i<index;i++)
	{
		rtrn=rtrn+str[i]+"#";
	}
	rtrn=rtrn+id+data+"#";
	for(int i=index;i<length;i++)
	{
		rtrn=rtrn+str[i]+"#";
	}
	return rtrn.substring(0,rtrn.length()-1);
}
if(op.equals("edit"))
{
	for(int i=0;i<length;i++)
	{
		if(str[i].startsWith(id))
		{
			 if(id.length()<str.length&Character.isDigit(str[i].charAt(id.length())))
			   {
				
			   }else
			   {
				   str[i]=id+data;
			   }
			
		}
	}
}
if(op.equals("delete"))
{
	for(int i=0;i<length;i++)
	{
		if(str[i].startsWith(id))
		{
		   if(id.length()<str.length&Character.isDigit(str[i].charAt(id.length())))
		   {
			
		   }else
		   {
			   str[i]="";
		   }
		}
	}
}


for(int i=0;i<length;i++)
{
	if(str[i]!="")
	rtrn=rtrn+str[i]+"#";
}


    return rtrn.substring(0,rtrn.length()-1);
  }
}
