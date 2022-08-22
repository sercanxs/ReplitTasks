package OOP;

public class PositionManager {
	  public String[][] boardR;//board array

	  private String[] shipTypes = new String[]{"ss","m","dddd","ccc"};
	  
	  public PositionManager(String[][] br){
	     boardR = br;
	  
	  }//end constructor
	  
	  public boolean placeShip(int row,int column,int dir,int shipT){
	    // TODO:




	      return true;
	  }//end place_ship



	  
	  public boolean isValidPos(int row,int column,int dir,int len){
	    // TODO:
	      if(boardR[row][column].equals("w"))
	      {
	    	  if(shipTypes[len].length()==1)
	    	  {
	    		  boardR[row][column]=shipTypes[len];
	    	  }else if(shipTypes[len].length()==2)
	    	  {
	    		  if(dir==0)
	    		  {
	    			  if(boardR[row+1][column].equals("w"))
	    			  {
	    				boardR[row+1][column]=""+shipTypes[len].charAt(0);  
	    				boardR[row][column]=""+shipTypes[len].charAt(0);
	    			  }
	    		  }
	    		  if(dir==1)
	    		  {
	    			  if(boardR[row][column+1].equals("w"))
	    			  {
	    				  boardR[row][column+1]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column]=""+shipTypes[len].charAt(0);
	    			  }
	    		  }
	    	  }else if(shipTypes[len].length()==3)
	    	  {
	    		  
	    		  if(dir==0)
	    		  {
	    			  if(boardR[row+1][column].equals("w")&boardR[row+2][column].equals("w"))
	    			  {
	    				  boardR[row+1][column]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column]=""+shipTypes[len].charAt(0);
		    				boardR[row+2][column]=""+shipTypes[len].charAt(0);  
		    				
	    			  }
	    		  }else
	    		  {
	    			  if(boardR[row][column+1].equals("w")&boardR[row][column+2].equals("w"))
	    			  {
	    				  boardR[row][column]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column+1]=""+shipTypes[len].charAt(0);
		    				boardR[row][column+2]=""+shipTypes[len].charAt(0);  
		    				
	    			  }
	    		  }
	    	  }else 
	    	  {
	    		  if(dir==0)
	    		  {
	    			  if(boardR[row+1][column].equals("w")&boardR[row+2][column].equals("w")&boardR[row+3][column].equals("w"))
	    			  {
	    				  boardR[row+1][column]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column]=""+shipTypes[len].charAt(0);
		    				boardR[row+2][column]=""+shipTypes[len].charAt(0);  
		    				boardR[row+3][column]=""+shipTypes[len].charAt(0);  
		    				
	    			  }
	    		  }else
	    		  {
	    			  if(boardR[row][column+1].equals("w")&boardR[row][column+2].equals("w")&boardR[row][column+3].equals("w"))
	    			  {
	    				  boardR[row][column]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column+1]=""+shipTypes[len].charAt(0);
		    				boardR[row][column+2]=""+shipTypes[len].charAt(0);  
		    				boardR[row][column+3]=""+shipTypes[len].charAt(0);
		    				
	    			  }
	    		  } 
	    	  }
	      }



	      return true;
	  }//end isValidPos
}
