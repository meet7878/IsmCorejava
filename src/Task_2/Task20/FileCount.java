/*task 20)
take 1 folder name with user and count how many java files present in that folder. 
if user entered wrong directory handle that scenario with proper message. */

package Taskjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileCount {
	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path=sc.next();
		File f = new File(path);
		System.out.println(f.exists());
		
		int count =0;
		if(f.isDirectory()) {
			File[] file =  f.listFiles();
			for (File f1:file) {
				if(f1.getName().endsWith(".java"));{
					count++;
					System.out.println(f1.getName());
				}	

			}
			
		}
		else {
			System.out.println("No java file found in folder!!");
		}
			System.out.println("Total  Number in File"+count);
	}

}
