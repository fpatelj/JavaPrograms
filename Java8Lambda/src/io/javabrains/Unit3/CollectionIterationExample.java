package io.javabrains.Unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), 
				new Person("Mark", "Twain", 42),
				new Person("Lewis", "Carroll", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		System.out.println("Using the for loop");
		for(int i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i));
		}
		
		
		for(Person p:people)
		{
			System.out.println(p);
		}
		System.out.println("Using the lambda forEach loop");
		people.forEach(System.out::println);//makes it easier for the processor to run in multiple threads, makes it run in parallel
	}

}
