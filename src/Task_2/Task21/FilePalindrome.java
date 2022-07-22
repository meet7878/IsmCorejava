/*task 21)
create 1 file and store 100 name. 
now open that file and read name and check any name is palindrome or not. [use thread ] 
*/

package Taskjava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePalindrome extends Thread
{

	int a, b;

	FilePalindrome(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}

	public void run() 
	{
    	
    	 for(int i=a;i<b;i++)
    	 {
		try 
		{
			String line = Files.readAllLines(Paths.get("C:\\\\Users\\\\lenovo\\\\Desktop\\\\ism\\\\Palindrome.txt")).get(i);
			String s = line.toLowerCase();
	        StringBuilder name = new StringBuilder(s);
			StringBuilder j = name.reverse();
			if (s.contentEquals(j)) 
			    {
				System.out.println(line + "--------- is palindrome"+"--------------------------"+i);
		        }
		 }	 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	 }

         
		}
     }

	public static void main(String[] args) throws IOException {
		Path f = Paths.get("C:\\Users\\lenovo\\Desktop\\ism\\Palindrome.txt");
		/* File f = new File("C:\\Users\\lenovo\\Desktop\\ism\\FilePalindrome.txt"); */
		long count = Files.lines(f).count();
		int num = (int) count;
		FilePalindrome t = new FilePalindrome(0, num / 10);
		FilePalindrome t2 = new FilePalindrome(num/10,num/8);
		FilePalindrome t3 = new FilePalindrome(num/8, num/6);
		FilePalindrome t4 = new FilePalindrome( num / 6,num/4);
		FilePalindrome t5 = new FilePalindrome(num/4,num/2);
		FilePalindrome t6 = new FilePalindrome(num/2, num);
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
	}

}
