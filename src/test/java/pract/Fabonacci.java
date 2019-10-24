package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fabonacci {
	public static int a = 0, b = 1, nextTerm;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Number of fabonacci series : ");
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++)

		{
			System.out.println(a);
			nextTerm = a + b;
			a = b;
			b = nextTerm;

		}
	}
}
