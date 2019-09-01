package io.javabrains.Unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), new Person("Mark", "Twain", 42),
				new Person("Lewis", "Carroll", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)

		);

		System.out.println("Printing all persons");
		performConditionally(people, p -> true, System.out::println); // p ->method(p)

	}

	public static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
				consumer.accept(p);
			}
		}
	}

}
