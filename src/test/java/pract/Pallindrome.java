package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {
	static int r, sum = 0, temp;

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int i = Integer.parseInt(br.readLine());
		temp = i;
		while (i > 0) {
			r = i % 10;
			sum = sum * 10 + r;
			i = i / 10;
		}
		System.out.println("Sum: " + sum);
		System.out.println("I: " + i);
		System.out.println("Temp: " + temp);
		if (temp == sum) {
			System.out.println("Number of pallindrome");
		} else {
			System.out.println("Not pallindrome");
		}
	}
}
