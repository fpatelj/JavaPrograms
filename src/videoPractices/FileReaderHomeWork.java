package videoPractices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderHomeWork {

	public static void main(String[] args) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test1.txt"));
		
		
			bufferedWriter.write("Hello World");
			bufferedWriter.newLine();
			bufferedWriter.write("My name is Feral");
			bufferedWriter.newLine();
			bufferedWriter.write("This is a mysterios world");
			bufferedWriter.newLine();
			bufferedWriter.write("It is fun though");
			bufferedWriter.newLine();
			bufferedWriter.write("Just explore");
			bufferedWriter.newLine();
			bufferedWriter.write("Just Roam");
			bufferedWriter.newLine();
			bufferedWriter.write("Just look around");
			bufferedWriter.newLine();
			bufferedWriter.write("Have fun");
			bufferedWriter.newLine();
			bufferedWriter.write("Visit places");
			bufferedWriter.newLine();
			bufferedWriter.write("It is fun though");
			bufferedWriter.newLine();
			bufferedWriter.write("So, Chill and relax.");
			bufferedWriter.write("It is fun though");
			bufferedWriter.newLine();
			bufferedWriter.write("It is fun though");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
		
		
		} catch (IOException e) {

			e.printStackTrace();
		}

		
		
		try {
			BufferedWriter bufferedWrite = new BufferedWriter(new FileWriter("test2.txt"));
		
			bufferedWrite.write("Hello World, it is fun explore visit though chill and relax");
			bufferedWrite.flush();
			bufferedWrite.close();
		
	
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

}
