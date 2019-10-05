package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
	public static int arm, sum = 0, temp;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integr : ");
		int i = Integer.parseInt(br.readLine());
		temp = i;
		while (i > 0) {
			arm = i % 10;
			sum = sum + arm * arm * arm;
			i = i / 10;
		}
		System.out.println("Sum :" + sum);
		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}
}