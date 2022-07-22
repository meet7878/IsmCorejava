/*5.Ticket Booking System.

Login
Exit 

Login => mobile number 

1.1 	Book Ticket { Gold Silver Diamond -Qty } 
1.2	View Booked Tickets
1.3	Available Tickets 
1.4       Logout

Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
One user can book max 7 Tickets.
Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
User can identified by mobile number. */


package Taskjava;
import java.util.Scanner;

class Tickite{
	 int user;
	 int Gold=20,silver=20,dimond=20;
	 int totaltickite=60,temp=0;
	
	void login() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the mobile num");
	    int mobile = sc.nextInt();
	    if(mobile>0) {
	    	System.out.println("Login Succesfully");
	    	System.out.println("Gold price=150\n"+"silver price=100\n"+"dimond price=200");
	    	
	    	System.out.println("choice ticket");
	    	int choice =sc.nextInt();
	    	
	    	switch(choice) {
	    	case 1:
	    		 
	    	  System.out.println("Enter Gold tickte");
	    	  int Egold= sc.nextInt();
	    	  System.out.println("Succefully Book Gold tickte "+Egold);
	    	  temp=Egold-Gold;
	    	  if(Egold>7) {
	    		  System.out.println("can book max 7 Tickets");
	    	  }
	    	  else {
	    		  System.out.println("Your Available tickite"+temp);
	    	  }
	    	  break;
	    	case 2:
	    		
	    		System.out.println("Enter silver tickte");
		    	  int st= sc.nextInt();
		    	  System.out.println("Succefully Book Gold tickte "+st);
		    	  temp=st-Gold;
		    	  if(st>7) {
		    		  System.out.println("can book max 7 Tickets");
		    	  }
		    	  else {
		    		  System.out.println("Your Available tickite"+temp);
		    	  }
		    	  
		    	  break;
		    	  
	    	case 3:
	    		System.out.println("Enter dimond tickte");
		    	  int dt= sc.nextInt();
		    	  System.out.println("Succefully Book Gold tickte "+dt);
		    	  temp=dimond-Gold;
		    	  if(dt>7) {
		    		  System.out.println("can book max 7 Tickets");
		    	  }
		    	  else {
		    		  System.out.println("Your Available tickite"+temp);
		    	  }
	    		
	    	}
	    	
	    }
	    		
	}
	
	void logout() {
		System.out.println("Logout Successfully");
		}
    
   

	public static void main(String args[]) {
		Tickite tc = new Tickite();
		tc.login();
		tc.logout();
		 	
	}

}