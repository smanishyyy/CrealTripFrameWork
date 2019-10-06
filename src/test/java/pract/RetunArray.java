package pract;

public class RetunArray {

	public static void main(String arg[]) {
		int arr[] = m();
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static int[] m() {

		return new int[] { 1, 2, 3, 4 };
	}

}
