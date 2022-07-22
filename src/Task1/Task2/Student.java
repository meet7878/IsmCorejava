import java.util.Scanner;


class Student{
	int  id;
	String Name,Email,password;
	
	Student(){
		
		 id =(int)(Math.random()*10000000);
	}
	
	void meth1() {
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter name");	
	Name=sc.next();
    
    System.out.println("Enter Email");	
	Email=sc.next();

    System.out.println("Enter password");	
	password=sc.next();
	sc.close();
	}
	
	
	void meth2() {
		System.out.println(id+"\t"+Name+"\t"+Email+"\t"+password);
	}
	



	public static void main(String args[]) {
		Student d = new Student();
		d.meth1();
		d.meth2();
		
		
	}
	
}