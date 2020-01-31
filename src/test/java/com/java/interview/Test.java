package com.java.interview;

public class Test {
	int test_a, test_b;
	static int m2 = 10;

	Test(int a, int b) {

		test_a = a;
		test_b = b;

	}

	public Test() {

		// this(10, 10);
		System.out.println("Gg");
		display(this);
		System.out.println(this);

	}

	private void display(Test test) {
		System.out.println("Good");
		this.m4();
	}

	static void m4()

	{
		System.out.println("M4");
	}
	static

	{
		System.out.println("M5");
	}


	public static void main(String args[]) {
		Test test = new Test();
		// Test test2 = new Test();

		System.out.println(test.test_a + " " + test.test_b + " " + test.m2);
	}
}
