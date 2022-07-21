package String;

import java.util.Scanner;

public class SmsMessage {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		    
		 message=message.replace("Sender:<", "");
		 
		 int a = message.indexOf(">. From Number:");
		 
		 sender = message.substring(0,a);
		 
		 message=message.replace(sender, "").replace(">. From Number:[", "");
		 
		 a = message.indexOf("]. Message:{");
		 
		 phoneNumber = message.substring(0,a);
		 
		 message=message.replace(phoneNumber, "").replace("]. Message:{", "");
		 
		 messageBody= message.substring(0,message.length()-1);
		 
		 System.out.println("Sender: "+sender);
		 System.out.println("Phone Number: "+phoneNumber);
		 System.out.println("Message body: "+messageBody);
		    
		
		
	}
	
	
	
}
