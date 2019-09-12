package videoPractices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class BufferedReader1 {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream(new File("test.txt"));

			int i = 0;
			while ((i = is.read()) != -1) {

				System.out.print((char) i);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		/*
		 * try { BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		 * System.out.println(br.readLine());
		 * 
		 * while(br.ready()) { System.out.println(br.readLine()); }
		 * 
		 * 
		 * 
		 * br.lines().forEach(str -> System.out.println(str)); //Lamda expression
		 * 
		 * 
		 * } catch (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}
}
