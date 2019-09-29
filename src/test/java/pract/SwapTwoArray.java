package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class SwapTwoArray {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int i2, sum1 = 0, sum2 = 0, i3, temp, i1 = 0, i4, newsum1, newsum2;
	public static LinkedList<Integer> ls;
	public static LinkedList<Integer> ls2;
	public static LinkedList<Integer> ls3 = new LinkedList<>();
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
		System.out.println("First list " + ls);
		System.out.println("Second list " + ls2);
		ls.forEach(arr4 -> {
			ls3.add(arr4);
		});
		ls.clear();
		ls.addAll(ls2);

		ls2.clear();
		ls2.addAll(ls3);
		System.out.println("First list " + ls);
		System.out.println("Second list " + ls2);
		TreeSet<Integer> st = new TreeSet<>(lst);
		System.out.println("Tree in asscending : " + st);
		TreeSet<Integer> tr = new TreeSet<>(new arrDesce());
		for (Integer in : st) {
			tr.add(in);
		}

		System.out.println("Tree in descending : " + tr);
	}
}
