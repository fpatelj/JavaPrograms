package remoteTiger;

import java.util.Scanner;

public class PrimeOrNot_08 {

	public static void main(String[] args) {

		int num, i, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = s.nextInt();
		for (i = 10; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}
	}

	boolean isPrime(int n) {

		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

