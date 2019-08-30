package remoteTiger;


import java.lang.Math;

public class PrimeOrNot_08 {

	public static void main(String[] args) {

		int i = 1103;
		System.out.println(isPrime(i));
	}

	static boolean isPrime(int n) {
		int count = 0;

		if (n % 2 == 0) {
			System.out.println("Loop ran:" + count);
			return false;
		}

		for (int i = 3; i < (n/2); i += 2) 
		
		
		//for (int i = 3; i <= Math.sqrt(n); i += 2)
			{
			count++;
			if (n % i == 0) {
				System.out.println("Loop ran:" + count);
				return false;
			}
		}
		System.out.println("Loop ran:" + count);
		return true;
	}
}
