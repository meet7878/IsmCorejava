/*task 18) 
take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
store into 	even.txt if number is even.*/

package Taskjava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo {
	public static void main(String args[]) throws IOException {
		/*
		 * File demo = new File("C:\\Users\\lenovo\\Desktop\\ism\\demo.txt");
		 * f.createNewFile(); PrintWriter d = new PrintWriter(demo);
		 */

		File f = new File("C:\\Users\\lenovo\\Desktop\\ism\\odd.txt");
		/* f.createNewFile(); */
		PrintWriter p = new PrintWriter(f);
		/* FileOutputStream fos = new FileOutputStream(f); */

		File even = new File("C:\\Users\\lenovo\\Desktop\\ism\\Even.txt");
		/* even.createNewFile(); */
		PrintWriter s = new PrintWriter(even);

		Scanner sc = new Scanner(System.in);

		System.out.println("please Enter the total number");
		int totalNum = sc.nextInt();

		for (int i = 0; i < totalNum; i++) {
			System.out.println("please Enter the number");
			int Number = sc.nextInt();

			if (Number % 2 == 0) {
				s.println(Number);
			}

			else {
				p.println(Number);
			}
		}
		p.close();
		s.close();
	}
}

/*
 * output:- please Enter the total number 10 please Enter the number 1 please
 * Enter the number 2 please Enter the number 3 please Enter the number 4 please
 * Enter the number 5 please Enter the number 6 please Enter the number 7 please
 * Enter the number 8 please Enter the number 9 please Enter the number 10
 */