package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
	public int id;
	public String str;

	public Student(int id, String str) {
		this.id = id;
		this.str = str;
	}

}

public class StudentArray {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static String str;
	public static int id;

	public static void main(String args[]) throws IOException {
		Student st[] = new Student[5];
		System.out.println("Enter the student information");
		int i = 0;
		for (Student s : st) {
			System.out.println("Enter student name");

			str = br.readLine();
			if (str.equals("qq")) {
				//System.exit(0);
				break;
			}
			System.out.println("Enter id");
			id = Integer.parseInt(br.readLine());
			st[i] = new Student(id, str);
			System.out.println(st[i]);

			i++;

		}
		//
		// for (Student s : st) {
		// System.out.println(s.id + ":" + s.str);
		//
		// }

		displaydata(st);

		int arr[][] = { { 2, 7, 9, 8 }, { 3, 6, 1, 8 }, { 7, 4, 2, 8 } };

		// printing 2D array
		for (int i1 = 0; i1 < 3; i1++) {
			for (int j = 0; j < 4; j++)
				System.out.print(arr[i1][j] + " ");

			System.out.println();
		}

	}

	private static void displaydata(Student[] st) {
		for (Student st2 : st)
			System.out.println(st2.id + ":" + st2.str);

	}

}
