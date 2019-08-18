package videoPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sorting {

	public static void main(String[] args) {

		/*
		 * List<Course> courses = new ArrayList<>(); courses.add(new Course(20));
		 * courses.add(new Course(28)); courses.add(new Course(15)); courses.add(new
		 * Course(63)); courses.add(new Course(80)); courses.add(new Course(90));
		 * 
		 * //Collections.sort(courses, Collections.reverseOrder());
		 * Collections.sort(courses);
		 * 
		 * courses.forEach(System.out::println);
		 */

		List<Employee> employees = Arrays.asList(new Employee[] {

				new Employee(10, "John"), new Employee(11, "Robert"), new Employee(12, "Sam"), new Employee(13, "Lily"),
				new Employee(14, "Samy"), new Employee(15, "Samy"), new Employee(16, "Samy"),
				new Employee(17, "Samy"), });

		/*
		 * Collections.sort(employees, new CompareByName());
		 * employees.forEach(System.out::println);
		 */

		// Collections.sort(employees, new CompareById());
		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getId().compareTo(o2.getId()); }
		 */

		Collections.sort(employees,
				(o1, o2) -> o1.getName().compareTo(o2.getName()) == 0 ? o1.getId().compareTo(o2.getId())
						: o1.getName().compareTo(o2.getName()) // Ternary Operator

		); // Lambda Expression Comparator

		employees.forEach(System.out::println);

	}

}
