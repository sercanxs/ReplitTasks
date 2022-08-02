package Arrays;

import java.util.Arrays;

public class I_2dArraysChessBoard {
public static void main(String[] args) {
	
    String[][] chessBoard = new String[8][8];
    //WRITE YOUR CODE HERE
    
    for(int i=0;i<chessBoard.length;i++) {
    	for(int j=0;j<chessBoard[i].length;j++) {
    		chessBoard[i][j]=""+(i+1)+(char)(j+65);
    		chessBoard[i][j]=chessBoard[i][j].toLowerCase();
    	}
    	
    }
    
    
    
    
    
    

    
    //DO NOT CHANGE
    System.out.println(Arrays.deepToString(chessBoard));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
