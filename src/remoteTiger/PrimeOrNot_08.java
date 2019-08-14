package remoteTiger;

import java.util.Scanner;

public class PrimeOrNot_08 {

	public static void main(String[] args) {

		int i = 1103;
		System.out.println(isPrime(i));
	}

	static boolean isPrime(int n) {
<<<<<<< HEAD
		int count = 0;

		if (n % 2 == 0) {
			System.out.println("Loop ran:" + count);
			return false;
		}

		for (int i = 3; i < (n/2); i += 2) {
			count++;
			if (n % i == 0) {
				System.out.println("Loop ran:" + count);
=======

		if (n % 2 == 0){
			return false;
		}

		for (int i = 3; i <= (n/2); i += 2) {
			if (n % i == 0){
>>>>>>> 3fa37309e899cc57a7b3b1c934cf35e0b8b04fef
				return false;
			}
		}
		System.out.println("Loop ran:" + count);
		return true;
	}
}
