package io.javabrains;

public class Greeter {
	public void greet(Greeting greeting)

	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.println("Hello World!");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("Hello World!");
			}

		};

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}
