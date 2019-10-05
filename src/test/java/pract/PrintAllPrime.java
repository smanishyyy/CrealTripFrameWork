package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAllPrime {
	public static int count = 0, n = 2;
	public static boolean flag;

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many prime number do you want to print: ");
		int num = Integer.parseInt(br.readLine());

		lb1: while (count != num) {
			flag = true;
			lb2: for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = false;
					break lb2;
				}
			}
			if (flag) {
				count++;
				System.out.println(n);
			}
			n++;
		}
	}
}