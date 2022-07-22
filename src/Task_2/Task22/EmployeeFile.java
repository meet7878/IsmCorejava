/*
empl app 
	id 
	name
	salary
	
5000 
	backup -> file  
	
	read 
	
1,ram,15000
2,laxman,20000
3,raja,5000
4,hero,15000
*/

package Taskjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeFile {
	int salary;
	String Name;
	int id;
	
	
   public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


void add() throws FileNotFoundException {
	   File f = new File("C:\\Users\\lenovo\\Desktop\\ism\\meet1.txt");
	   PrintWriter pw = new PrintWriter(f);
	   Scanner sc = new Scanner(System.in);
	   pw.println("Name  id  Salary \n");
	  for(int i=0;i<3;i++) { 
		  id = (int)(Math.random()*10000);
		  
	   System.out.println("Enter the name");
	    Name = sc.next();
	   
	   System.out.println("Enter the salary");
	     salary = sc.nextInt();
	     
	     pw.println(Name+ " " +id +" " +salary);
	  }
		
	   pw.close();
	   sc.close();
 }
 

public static void main(String[] args) throws FileNotFoundException {
	EmployeeFile e = new EmployeeFile();
	Scanner sc = new Scanner(System.in);
	e.add();


}
}
