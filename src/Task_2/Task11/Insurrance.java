// 11) 
//    Insurance Calc 
//		An insurance company follows following rules to calculate premium.
//		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
//		city and is a male then the premium is Rs. 4 per thousand.
//		b. If a person satisfies all the above conditions except that the gender is female then the premium is
//		Rs. 3 per thousand.
//		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
//		village and is a male then the premium is Rs. 6 per thousand.
//		d. In all other cases the person is not insured.
//		Take a person's health, age, city and gender as an input and display the premium as per the rule.
package Taskjava;
import java.util.*;

class Insurrance{
	String person,helth;
	String living,gender;
	int age;
	
	Scanner sc=new Scanner(System.in);
	
	void view() {
		
		System.out.println("Enter helth ");
		helth=sc.next();
			
		System.out.println("Enter person Name ");
		person=sc.next();
		
		System.out.println("Enter the person age ");
		age=sc.nextInt();
		
		System.out.println("Enter the living Area");
		living=sc.next();
			
		System.out.println("Enter the gender ");
		gender=sc.next();
		

		
		if((helth.equals("excellent"))&& age>=25 ||age<=35 && living.equals("city") && gender.equals("male")) {
			 
						System.out.println("permioum 40000");
					}
		
		else if((helth.equals("excellent")) && age>=25 ||age<=35 && living.equals("city") && gender.equals("female")) {
			
					System.out.println("permioum 30000");
		}
		
		else if((helth.equals("poor"))&& age>=25 ||age<=35 && living.equals("village")&& gender.equals("male")) {
			
			
					System.out.println("permioum 60000");
				}
			
		
		else {
			System.out.println("person is not insured");
		}
	}
		
	public static void main(String args[]) {
		Insurrance i =new Insurrance();
		i.view();
		
		
	}
}