package Methods;

public class SimplePrintPattern {
public static void main(String[] args) {
	
	
	  printHollowRect();
}
public static void printHollowRect(){
    // write your codes here
    
    for(int i=0;i<5;i++)
    {
    	System.out.print("*");
       for(int j=0;j<3;j++)
       {
    	   if(i!=0&i!=4)
    	   {
    		   System.out.print(" ");
    	   }
    	   else
    	   {
    		   System.out.print("*");
    	   }
       }
       System.out.println("*");
       
    }
   
  }
}
