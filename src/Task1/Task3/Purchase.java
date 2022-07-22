/*13)
 	class Levis 
 		name
 		price
 		category 
 		tax 
 		amount    
   	methods 
   		input 
   		print 
   		
   	user can purchase any item from levis . when user purchase they input all the details
   	of item for levis , tax need to calculate automatically. 
   	tax is based on price of levis item. 
   	like, if category is men then tax is 15% 
   	         category is women then tax is 10% 
   	         category is student then tax is 5% 
   	         
   	once all input done print all response. 
   	
   	ex: 
   	input:
   	    name : denim jeans  
   	    price : 1500
   	    category : men 
   	    
   	output : 
   	  denim jeans 	1500	men 225  1725 */

package Task1.Task3;
import java.util.Scanner;
class Purchase{
	
	String  Name;
	int category;
	Double price,tax,amount,total;
	 
	Scanner sc = new Scanner(System.in);
	
	
	void meth() {
		System.out.println("Enter the product ");
		Name = sc.next();
		
		System.out.println("Enter the price ");
		price = sc.nextDouble();
		
		System.out.println("1.man");
		System.out.println("2.women");
		System.out.println("3.student");
		System.out.println("Enter the Category Choice ");
		category = sc.nextInt();
		
		if(category==1) {
	     System.out.println("Man");
	     tax= price *0.15;
	     total = tax + price;
	  
		}
		else if(category==2) {
			System.out.println("women");
			tax= price *0.15;
		     total = tax + price;
			
		}
		
		else {
			System.out.println("student");
			tax= price *0.15;
		     total = tax + price;
			
		}
	
	}
	
	void display() {
		System.out.println("Name\t"+"Price\t"+"tax\t"+"total");
		System.out.println("-----------------------------");
		System.out.println(Name+"\t"+price+"\t "+tax+"\t "+total);
	}
	
	public static void main(String args[]) {
		Purchase p = new Purchase();
		p.meth();
		p.display();
		
		
	}
	
}