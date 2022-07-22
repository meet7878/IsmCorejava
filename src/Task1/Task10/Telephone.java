/*20.telephone Diary 


We need to create one diary app for user.
when user open app it display menu for operation 
e.g

1 Add new Contact
2 Edit Contact
3 Search Contact 
4 Remove Contact 
5 Exit From App 


1 Add contact will add new contact in app. we need to store first name last name and phone number of user. 
2 Edit contact will modify user info.  user can search via firstname once user found then only edit function will work
3 when user want to contact any person user can use this functionality, he can add first name of user and your app will list all users with matching first name 
4  remove contact will remove contact from app user can remove contact via first name , if multiple user found then app need to confirm which user need to be deleted , you have to manage this by your own way 
5 exit :) */

package Taskjava;
import java.util.*;

public class Telephone {
    long number;
    String firstname;
    String lastname;
    static Scanner sc = new Scanner(System.in);
    Telephone T[] = new Telephone[100];
    static int i=0;
    static int count=0;


    void Add_contect() {
        System.out.println("enter first name");
        firstname = sc.next();
        System.out.println("enter last name");
        lastname = sc.next();
        System.out.println("enter mobile number");
        number = sc.nextInt();
        count++;
    }

    void Edit_contact(String search) {
        for (int i = 0; i < count; i++) {
        	System.out.println(count);
            if (search.equals(T[i].firstname)) {
        System.out.println("1: change firstname");
        System.out.println("2: change lastname");
        System.out.println("3: change Contact");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                System.out.println("Firstname");
                T[i].firstname = sc.next();
                break;
            case 2:
                System.out.println("Lasttname");
                T[i].lastname = sc.next();
                break;
            case 3:
                System.out.println("contact number");
                T[i].number = sc.nextInt();
                break;
            default:
                System.out.println("please enter vailid choice");
                Edit_contact(search);
                break;
        }
    }
            else {
            	System.out.println("Data not found");
            }
    }
        
    }

    void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(T[i].firstname + " " + T[i].lastname + " " + T[i].number);
            
        }
    }

    void Search_contact(String name) {
            for (int i = 0; i < count; i++) {
                if (name.equals(T[i].firstname)) {
                    System.out.println(T[i].firstname + " " + T[i].lastname + " " + T[i].number);
                }
            }
    }

    void delete_contact(String name){
        for (int i = 0; i < count; i++) {
            if (name.equals(T[i].firstname)) {
                System.out.println(T[i].firstname + " " + T[i].lastname + " " + T[i].number);
				/*
				 * for (int y = i; y < count-1; y++){
				 * 
				 * T[y].firstname = T[y+1].firstname; T[y].lastname = T[y+1].lastname;
				 * T[y].number = T[y+1].number; }
				 * System.out.println("user deleted.............."); count--;
				 */
              
				T[i].firstname="";
				T[i].lastname="";
				T[i].number=0;
				System.out.println("User deleted Successfully");
                
                
                }
            }
        }
    public void Choice() {
        while (true) {

            System.out.println("1: Add new Contact");
            System.out.println("2: Edit Contact");
            System.out.println("3: Search Contact");
            System.out.println("4: Remove Contact");
            System.out.println("5: Exit From App");
            
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    T[i] = new Telephone();
                    T[i].Add_contect();
                    i++;
                    break;
                case 2:
                    System.out.println("please enter the first name of contact you change");
                    String search = sc.next();
                    Edit_contact(search);
                    break;
                case 3:
                    System.out.println("please enter the first name of contact you want to search");
                    String name = sc.next();
                    Search_contact(name);
                    break;
                case 4:
                    System.out.println("please enter the first name of contact you want to search");
                    name = sc.next();
                    delete_contact(name);
                    break;
                case 5:
                    System.out.println("you are now exit to app");
                    System.exit(0);
                    break;
                case 6:
                    print();
                    break;
                default:
                    break;
            }

        }
    }

    public static void main(String[] args) {
        Telephone s = new Telephone();
        s.Choice();
    }
}