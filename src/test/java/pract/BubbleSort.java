package pract;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.lang3.ArrayUtils;

class BubbleSort {
	static int temp;

	public static void main(String arg[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int len = arr.length;
		int[] arr2 = bubbleSort(arr, len);
		System.out.println("Ascending :");
		display(arr2);
		System.out.println();
		System.out.println("descending :");
		displaydescending(arr2);

	}

	private static void displaydescending(int[] arr2) {
		List<Integer> ls = Arrays.asList(ArrayUtils.toObject(arr2));

		ListIterator<Integer> itr = ls.listIterator(ls.size());
		// System.out.print("descending :" + itr);
		while (itr.hasPrevious()) {
			System.out.print(itr.previous() + ",");
		}

	}

	private static void display(int[] arr2) {
		for (int u : arr2) {
			System.out.print(u + ",");
		}
	}

	private static int[] bubbleSort(int[] arr, int len) {
		boolean swapped;
		swapped = false;
		int i, j = 0;
		for (i = 0; i < len - 1; i++)

		{

			for (j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}

			}

			if (swapped == false) {
				System.out.println("I :" + i + " J : " + j);
				break;
			}
			System.out.println("End of inner for");
		}
		System.out.println("End of outer for");
		return arr;
	}

}