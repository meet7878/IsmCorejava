/*task 20) 
take 1 file name with entire path
	if file is present count total number of vowels from it.
	if file not present print file not present try again.*/

package Taskjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileVowel2 {

	public static void main(String args[]) throws IOException
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		
		String  path=sc.next();
		File f = new File(path);
		
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		while(true) {
		int s = br.read();
		if(s==-1)
		{
			break;
		}
		else if(s=='a' || s=='e' || s== 'i' || s=='o' || s=='u' || s=='A' || s=='E' || s== 'I' || s=='O' || s=='U' ) {
			count++;
		}
	}
		System.out.println("Total number of vowel "+ count);
	}
	

}
