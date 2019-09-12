package org.learn.javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// List<Integer> myList = new ArrayList<Integer>();
		// List<Integer> myList = new LinkedList<Integer>();
		// Set<Integer> mySet = new HashSet<Integer>();

		/*
		 * Integer i = 10; myList.add(i); myList.add(1); myList.add(15); myList.add(8);
		 * myList.add(i); myList.forEach(System.out::println);
		 */

		/*
		 * Set<Integer> mySet = new TreeSet<Integer>(); Integer i = 10; mySet.add(i);
		 * mySet.add(1); mySet.add(15); mySet.add(8); mySet.add(i);
		 * 
		 * mySet.forEach(System.out::println);
		 */

		// myList.forEach(System.out::println);

		/*
		 * Map<Integer, String> myMap = new HashMap<>(7);
		 * 
		 * myMap.put(10, "John"); myMap.put(15, "Mark"); myMap.put(20, "Terry");
		 * myMap.put(1, "Kevin"); myMap.put(2, "David"); myMap.put(3, "Luke");
		 * myMap.put(4, "Mark");
		 * 
		 * 
		 * myMap.entrySet().forEach(x -> System.out.println(x.getKey()+ ":" + x.getValue()));
		 */
		/*
		 * List<Employee> employees = Arrays.asList(new Employee(15, "John"), new
		 * Employee(7, "Luke"), new Employee(12, "kevin"), new Employee(14, "Tom"), new
		 * Employee(14, "Tom")); employees.forEach(System.out::println);
		 * 
		 * Set<Employee> employeeSet = new HashSet<>(employees);
		 * 
		 * employeeSet.forEach(x -> System.out.println(x));
		 */
		
		
		
		Employee e1 = new Employee(15, "John");
		Employee e2 = new Employee(7, "Luke");
		Employee e3 = new Employee(12, "kevin");
		Employee e4 = new Employee(14, "Tom");
		Employee e5 = new Employee(14, "Rachel");
		//System.out.println(e4.equals(e5));
		
		
		HashMap<Integer , Employee> myEmployeeMap = new HashMap<>(10);
		
		  Map<Employee, Employee> myEmployeeMap = new HashMap<>(10);
		  myEmployeeMap.put(e1, e1); myEmployeeMap.put(e2, e2); myEmployeeMap.put(e3,
		  e3); myEmployeeMap.put(e4, e4); myEmployeeMap.put(e5, e5);
		 
		
		
		myEmployeeMap.entrySet().forEach(x -> System.out.println(x.getKey()+ ":" + x.getValue()));
		
		/*
		 * Set<Employee> myEmployeeSet = new TreeSet<>(); myEmployeeSet.add(e1);
		 * myEmployeeSet.add(e2); myEmployeeSet.add(e3); myEmployeeSet.add(e4);
		 * myEmployeeSet.add(e5);
		 * 
		 * myEmployeeSet.forEach(System.out::println);
		 */
	}
	

}
