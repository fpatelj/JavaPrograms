package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		List<Country> countries = Arrays.asList(
				new Country(1, "India"),
				new Country(2, "USA"),
				new Country(3, "Europe"),
				new Country(4, "Egypt"),
				new Country(5, "UAE")
			);
		
		Set<Country> countrySet = new HashSet<>(countries);
		
		countrySet.forEach(x -> System.out.println(x));
				
	}

}
