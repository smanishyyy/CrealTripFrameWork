package pract;

public class JaggedArray {
	public static void main(String args[]) {
		int arr[][] = new int[6][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		arr[5] = new int[6];

		int i, j, k = 0;
		for (i = 0; i < 6; i++) {
			for (j = 0; j < i + 1; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		for (i = 0; i < 6; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();

		}
	}

}
