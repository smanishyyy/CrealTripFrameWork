package pract;

public class ThrowExcep {
	static void fun() throws NullPointerException {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException p) {
			System.out.println("Caught inside fun().");
			throw p; // rethrowing the exception
		}
	}

	public static void main(String args[]) {
		try {
			fun();
		} catch (NullPointerException p) {
			System.out.println("Cough main");

		}

	}
}
