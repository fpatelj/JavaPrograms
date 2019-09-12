package videoPractices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderHomeWork {

	public static void main(String[] args)

			throws FileNotFoundException {

		Scanner console = new Scanner(System.in);

		intro();

		System.out.print("\tEnter the first file name: ");

		String file1 = console.nextLine();

		System.out.print("\tEnter the second file name: ");

		String file2 = console.nextLine();

		System.out.println();

		System.out.println("Differences Found: \n");

		compareFiles(new Scanner(new File(file1)), (new Scanner(new File(file2))));

	}

	

	public static void intro() {
	 
	         System.out.println("This program reads from two given input files and");
	
	         System.out.println("prints information about the differences between them. \n");
	
	     }

	public static void compareFiles (Scanner file1, Scanner file2) {
	      String lineA ;
	
	       String lineB ;
	 
	         int x = 1;
	 
	         while (file1.hasNextLine() && file2.hasNextLine()) {
	 
	             lineA = file1.nextLine();
	 
	             lineB = file2.nextLine();
	 
	             if (!lineA.equals(lineB)) {
	 
	                 System.out.println("Line " + x++);
	
	                 System.out.println("< " + lineA);
	
	                 System.out.println("> " + lineB + "\n");
	
	          }
	 
	         }
	 
	     }

}
