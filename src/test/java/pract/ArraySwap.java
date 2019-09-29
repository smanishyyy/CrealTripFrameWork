package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.lang3.ArrayUtils;

public class ArraySwap {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int i2, sum1 = 0, sum2 = 0, i3, temp, i1 = 0, i4, newsum1, newsum2;
	public static LinkedList<Integer> ls;
	public static LinkedList<Integer> ls2;
	public static Hashtable<Object, Integer> hs = new Hashtable<>();

	public static void main(String arg[]) throws IOException {
		System.out.println("Enter value in 1st array");
		System.out.println("Size of first array : ");
		i2 = Integer.parseInt(br.readLine());

		int arr[] = new int[i2];
		for (int i = 0; i < i2; i++) {
			System.out.println("Insert value at index at [" + i + "]");
			arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.println(arr);
		List<Integer> lst = Arrays.asList(ArrayUtils.toObject(arr));
		ls = new LinkedList<>(lst);
		i3 = 0;
		for (int i : ls) {
			System.out.println("First list value  at index [" + i3 + "]: " + i);
			i3++;
		}
		System.out.println("Size of Second array : ");
		i4 = Integer.parseInt(br.readLine());
		int arr2[] = new int[i4];
		for (int i = 0; i < i4; i++) {
			System.out.println("Insert value at index at [" + i + "]");
			arr2[i] = Integer.parseInt(br.readLine());

		}
		System.out.println(arr2);
		List<Integer> lst2 = Arrays.asList(ArrayUtils.toObject(arr2));
		ls2 = new LinkedList<>(lst2);
		i3 = 0;
		for (int i : ls2) {
			System.out.println("Second list value  at index  [" + i3 + "]: " + i);
			i3++;
		}

		ls.forEach(arr3 -> {

			sum1 = sum1 + arr3;
		});

		System.out.println("Sum of First list " + sum1);

		ls2.forEach(arr3 -> {

			sum2 = sum2 + arr3;
		});
		System.out.println("Sum of Second list " + sum2);
		for (int i = 0; i < i2; i++)

		{
			for (int j = 0; j < i4; j++) {
				newsum1 = sum1 - ls.get(i) + ls2.get(j);
				newsum2 = sum2 - ls2.get(j) + ls.get(i);
				if (newsum1 == newsum2) {
					hs.put("First array at index [" + i + "] : " + ls.get(i) + " : " + "Second array at index [" + j
							+ "] : " + ls2.get(j), newsum1);
				}
			}
		}

		System.out.println(hs.entrySet());
		for (Entry<Object, Integer> mp : hs.entrySet()) {

			System.out.println(mp.getKey() + ":" + mp.getValue());
		}

	}

}
