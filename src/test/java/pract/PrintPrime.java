package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrime {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Sum : ");
		int i = Integer.parseInt(br.readLine());

		printPrm(i);

	}

	private static void printPrm(int num) {
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++)
			if (num % i == 0) {
				return false;
			}
		return true;
	}
}
