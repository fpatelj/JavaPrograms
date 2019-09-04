package io.javabrains.Unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), 
				new Person("Mark", "Twain", 42),
				new Person("Lewis", "Carroll", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		
		/*
		 * people.stream() .filter(p -> p.getLastName().startsWith("C")) .forEach(p ->
		 * System.out.println(p.getFirstName()));
		 */
		
		long count = people.parallelStream() //faster	
		.filter(p -> p.getLastName().startsWith("C"))
		.count();
		
		System.out.println(count);
	}

}
