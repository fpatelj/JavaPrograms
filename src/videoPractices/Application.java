package videoPractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {

	public static void main(String[] args) {

		
		  try { FileInputStream fis = new FileInputStream(new File("student.ser"));
		  
		  ObjectInputStream ois = new ObjectInputStream(fis);
		  
		  Student deserializedStudent = (Student) ois.readObject();
		  System.out.println(deserializedStudent);
		  
		  } catch (FileNotFoundException e) {
		  
		  e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); } catch
		  (ClassNotFoundException e) { e.printStackTrace(); }
		 

/*		Student s1 = new Student(1000, new Course(2000), "John Doe");
		System.out.println("Original Object");
		System.out.println(s1);

		try {
			File file = new File("student.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s1);
			oos.flush();
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) { // TODO Auto-generated catch
			e.printStackTrace();
		}
	}
*/
	/*
	 * try { Student s1Clone = (Student) s1.clone();
	 * System.out.println("Clonned object"); System.out.println(s1Clone);
	 * 
	 * 
	 * s1.setId(5555); System.out.println("after modification");
	 * System.out.println("Original Object"); System.out.println(s1);
	 * System.out.println("Clonned object"); System.out.println(s1Clone);
	 * 
	 * 
	 * s1.getCourse().setId(6666);
	 * 
	 * System.out.println("after modification");
	 * System.out.println("Original Object"); System.out.println(s1);
	 * System.out.println("Clonned object"); System.out.println(s1Clone); }
	 * 
	 * catch (CloneNotSupportedException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * Object obj = new Object();
	 * 
	 * }
	 */

}}
