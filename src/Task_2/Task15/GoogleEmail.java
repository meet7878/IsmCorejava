
package Taskjava;

import java.util.Scanner;

public class GoogleEmail {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gmail");
		String name =sc.next();
	  
		try {
		 if(name.matches("[a-zA-Z0-9]+@gmail.com")) {
			System.out.println(name); 
		 }
		 else {
			 throw new InvalidEmailException("Invalid Email Address");
		 }
		}
		 catch (Exception e) {
			 System.out.println(e);
			// TODO: handle exception
		}
		
	}
}
	
	class InvalidEmailException extends Exception{
		public InvalidEmailException(String name) {
		super(name);
		}
	}
	/*
	 * static boolean isValid(String email) { String regex =
	 * "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
	 * return email.matches(regex); } public static void main(String[] args) {
	 * String email = "Meetmodi7009@gmail.com";
	 * System.out.println("The E-mail ID is: " + email);
	 * System.out.println("Is the above E-mail ID valid? " + isValid(email)); }
	 */
		
	

