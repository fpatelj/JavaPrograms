package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	private static final int List = 0;
	private static final int Person = 0;

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), new Person("Mark", "Twain", 42),
				new Person("Lewis", "Carroll", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)

		);

		// Step 1: Sort List by lastName
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return 0;
			}

		});

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);

		// Step 3: create a method that prints all people that have last name beginning with C
		System.out.println("Printing All persons Last Names beginning with C");
		printConditionally(people, new Condition()

		{

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("C");
			}

		});
		
		System.out.println("Printing All persons First Names beginning with C");
		printConditionally(people, new Condition()

		{

			@Override
			public boolean test(Person p) {

				return p.getFirstName().startsWith("C");
			}

		});
	}

	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

}

interface Condition {
	boolean test(Person p);
}
