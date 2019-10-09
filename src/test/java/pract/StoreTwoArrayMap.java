package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.apache.commons.lang3.ArrayUtils;

public class StoreTwoArrayMap {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int num, data, k;
	public static LinkedList<Integer> ls = new LinkedList<>();
	public static LinkedList<Integer> ls2 = new LinkedList<>();
	public static HashMap<Integer, Integer> hs = new HashMap<>();

	public static void main(String arg[]) throws IOException {

		System.out.println("How many data you want to insert in first array :");
		num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			System.out.println("Enter input for index [" + i + "] : ");
			data = Integer.parseInt(br.readLine());
			ls.add(data);
		}
		System.out.println(ls);
		Integer arr[] = ls.toArray(new Integer[ls.size()]);
		int arr2[] = ArrayUtils.toPrimitive(arr);
		System.out.println("Now insert data in second array :");
		for (int i = 0; i < num; i++) {
			System.out.println("Enter input for index [" + i + "] : ");
			data = Integer.parseInt(br.readLine());
			ls2.add(data);
		}
		Integer arr3[] = ls2.toArray(new Integer[ls.size()]);
		int arr4[] = ArrayUtils.toPrimitive(arr3);

		for (int i = 0; i < num; i++) {
			hs.put(arr2[i], arr4[i]);
		}
		System.out.println(hs.entrySet());
		System.out.print("[");
		for (Entry<Integer, Integer> e : hs.entrySet()) {
			System.out.print(+e.getKey() + "-" + e.getValue() + ",");
		}
		System.out.print("]");
	}

}
