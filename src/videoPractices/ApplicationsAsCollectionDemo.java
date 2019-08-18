package videoPractices;

public class ApplicationsAsCollectionDemo {

	public static void main(String[] args) {
		/*
		 * String a1 = "Test"; String b1 = "Test";
		 * 
		 * String c1 = new String("Test");
		 * 
		 * System.out.println(a1 == b1); System.out.println(a1==c1);//false, it created
		 * an object in heap and it referenced to the string pool
		 * System.out.println(a1.equals(c1));//true, because we used the equals() as it
		 * breaks the string into array of characters and it checks each character
		 */

		/*
		 * Object o1 = new Object(); Object o2 = new Object();
		 * 
		 * System.out.println(o1 == o2); //because we are comparing two different memory
		 * reference System.out.println(o1.equals(o2));
		 */

		Course course1 = new Course(1010);
		Course course2 = new Course(1020);
		Course course3 = new Course(1010);
		Course course4 = course1;

		//System.out.println(course1 == course1);
		//System.out.println(course1 == course2);
		//System.out.println(course1 == course3);// even if it has the same id, it points to the different object in the heap
		System.out.println(course1.equals(course2));
		//System.out.println(course1 == course4);//it got reference of course1
		
		
		System.out.println(course1.hashCode());
		System.out.println(course2.hashCode());
	}

}
