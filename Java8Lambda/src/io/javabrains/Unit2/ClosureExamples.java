package io.javabrains.Unit2;

public class ClosureExamples {

	public static void main(String[] args) {
		int a = 10;
		int b= 20; //scope variables
		doProcess(a, (i)-> System.out.println(i+b));
		
	}

public static void doProcess(int i, Process p)
{
	p.process(i);
}
}

interface Process {
	void process(int i);
}