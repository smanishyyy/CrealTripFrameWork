package pract;

public class TestLab {
	static int b = 66;

	static int method(String a, int i) {
		System.out.println("in static method of TestLab" + " Coming from " + a);
		System.out.println("b is " + i);
		return 6;
	}

	TestLab() {
		System.out.println("Inside test lab constructor");
	}

	static int a = method("Line 11", 1);
	static {
		System.out.println("AA" + b);
		System.out.println("In static block of TestLab");
	}

}