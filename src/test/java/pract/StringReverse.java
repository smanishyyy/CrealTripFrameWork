package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static String rev = "", temp;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string : ");
		String arg = br.readLine();
		temp = arg;
		char ch[] = arg.toCharArray();
		for (int i = arg.length() - 1; i >= 0; i--) {
			rev = rev + arg.charAt(i);
		}
		System.out.println("Reverse: " + rev);
		if (temp.equals(rev)) {
			System.out.println("Equal");
		} else {
			System.out.println(" Not Equal");
		}
	}
}
