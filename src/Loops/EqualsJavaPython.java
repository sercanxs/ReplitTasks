package Loops;

import java.util.Scanner;

public class EqualsJavaPython {
public static void main(String[] args) {
	
	
	
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    
	int a = 0;
	int b = 0;
	int c =0;
	
	
	
	for(int i=0;i+c<sentence.length();i++) {
		
		if(sentence.substring(c+i,sentence.length()).contains("java")){
	a++;		
		c=c+sentence.substring(c+i,sentence.length()).indexOf("java");	
		}
			
	}
	
	c=0;
	for(int i=0;i+c<sentence.length();i++) {
		
		if(sentence.substring(c+i,sentence.length()).contains("python")){
	b++;		
		c=c+sentence.substring(c+i,sentence.length()).indexOf("python");	
		}
			
	}
	if(a==b) {System.out.println("true");}else {System.out.println(false);}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
