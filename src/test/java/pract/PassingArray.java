package pract;

public class PassingArray {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println("sum of array values : " + sum2(arr));
	}

	public static int sum2(int[] arr) {
		int sum = 0;
		for (int arr2 : arr) {
			sum = sum + arr2;

		}

		return sum;

	}
}
