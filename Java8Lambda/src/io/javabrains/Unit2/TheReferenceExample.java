package io.javabrains.Unit2;

public class TheReferenceExample {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		TheReferenceExample thisReferenceExample = new TheReferenceExample();

		thisReferenceExample.execute();
	}

	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}

}
