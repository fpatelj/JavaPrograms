package videoPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		
		
		/*
		 * Course course = new Course(1010); System.out.println(course);
		 * System.out.println(course.toString());
		 * 
		 * 
		 * ArrayList<Integer> is = new ArrayList<>(); Collections.synchronizedList(is);
		 * 
		 * 
		 * Integer[] myArray = new Integer[10];
		 */
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		myList.add(1);
		myList.add(2);
		myList.add(19);
		myList.add(15);
		myList.add(12);
		myList.add(11);
		myList.add(13);
		myList.add(9);
		myList.add(7);
		
		
		System.out.println(myList);
		//Collections.sort(myList);
		//Collections.reverse(myList);
		
		Collections.sort(myList, Collections.reverseOrder());
		System.out.println(myList);
		
		
	}	

}
