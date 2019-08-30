package org.learn.javacollection;

public class HashCodeImplementation {

	public static void main(String[] args) {
		Student s1 = new Student("John", 1001);
		Student s2 = new Student("John", 1001);

		boolean b = s1.equals(s2);
		int x = s1.hashCode();
		int y = s2.hashCode();
		
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);

	}

}
