package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static boolean b = false;

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Check if number is prime: ");
		int num = Integer.parseInt(br.readLine());

		if (isPrime(num)) {
			System.out.println("Prime");
		} else

		{
			System.out.println("Not Prime");
		}

	}

	private static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return b = false;
			}
		}
		return b = true;

	}
}
