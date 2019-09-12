package videoPractices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringIO {

	public static void main(String[] args) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
			bufferedWriter.write("Hello World");
			bufferedWriter.newLine();
			bufferedWriter.write("My name is Feral");
			bufferedWriter.newLine();
			bufferedWriter.write("This is a mysterios world");
			bufferedWriter.newLine();
			bufferedWriter.write("It is fun though");
			bufferedWriter.newLine();
			bufferedWriter.write("So, Chill and relax.");
			bufferedWriter.flush();
			bufferedWriter.close();

		}

		catch (IOException e) {

			e.printStackTrace();
		}
	}

}
