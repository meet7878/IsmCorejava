package Taskjava;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneArrayList {

	public static void main(String args[]) {
		ArrayList<Persons> list = new ArrayList<Persons>();
		Scanner sc = new Scanner(System.in);

		while (true) {

			Persons p = new Persons();

			System.out.println("1.Enter Detail");
			System.out.println("2.Edit");
			System.out.println("3.search");
			System.out.println("4.remove");
			System.out.println("5.Display");
			System.out.println("6.Exit");

			System.out.println("please Enter the Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter First Name");
				p.setFirstName(sc.next());

				System.out.println("Enter Last Name");
				p.setLastName(sc.next());

				System.out.println("Enter Contact Num");
				p.setAddContact(sc.nextInt());

				list.add(p);

				break;

			case 2:
				System.out.println("Enter Edit Section porstion start");
				System.out.println("Enter name");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {

					if (name.equals(list.get(i).getFirstName())) {
						System.out.println("1: change firstname");
						System.out.println("2: change lastname");
						System.out.println("3: change Contact");

						switch (sc.nextInt()) {
						case 1:
							System.out.println("Enter new firstname");
							list.get(i).setFirstName(sc.next());
							break;

						case 2:
							System.out.println("Enter New Last name");
							list.get(i).setLastName(sc.next());
							break;

						case 3:
							System.out.println("Enter new Cntatct Num");
							list.get(i).setAddContact(sc.nextInt());
							break;
                            
						}
						System.out.println(list);

					}
					
				}
				break;
			case 3:
				System.out.println("Enter the Serching name ");
				String names = sc.next();
				for(int i=0;i<list.size();i++) {
                      if(names.equals(list.get(i).FirstName)) {
                    	  System.out.println(list.get(i).toString());	  
                      }
				}
				
				break;
				
			case 4:
				System.out.println("please remove the element");
				String naming = sc.next();
				for(int i=0;i<list.size();i++) {
					if(naming.equals(list.get(i).FirstName)) {
						list.remove(i);
					System.out.println("Remove succefully");	
						
					}
				}
				break;
				
			case 5:
				System.out.println(list);
				break;
				
			case 6:
				System.exit(0);
				
				
			}

		}
		
	}
}

	class Persons{
		 
		 String FirstName;
		 String LastName;
		 int AddContact;
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public int getAddContact() {
			return AddContact;
		}
		public void setAddContact(int addContact) {
			AddContact = addContact;
		}
		
	 public  String toString() {
		 return "FirstName-->" + FirstName + "\nLastName-->"+LastName + "\nContactNum-->" +AddContact ; 
	 }
}
