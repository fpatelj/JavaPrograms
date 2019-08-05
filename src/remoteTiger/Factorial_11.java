package remoteTiger;

public class Factorial_11 
{

	public static void main(String[] args) {
		
		int num = 10;
		long factorial = 1;
		for(int i = 1; i<=num; i++)
		{
			factorial *=i;
		}

		System.out.printf("The factorial of %d = %d", num, factorial);
	}

}
