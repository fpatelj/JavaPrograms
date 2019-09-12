package videoPractices;

public class StringConcepts {

	public static void main(String[] args) {

String s1 = "Test";
String s2 = "Test"; // String literal
String s3 = new String("Test"); // String Constructor

System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s2==s3);
		/*
		 * This prints a different value because when we say a new string, it created
		 * the new object and its referencing it within the memory object and hence the
		 * address of that variable is assigned to a different value
		 * It checks the value and not the memory reference
		 */
System.out.println(s2.equals(s3));
	}
	
	Object o1 = new Object();
	

}
