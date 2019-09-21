package pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class MixArray {

	@SuppressWarnings("unchecked")
	public static void main(String arg[]) {
		int arr[] = { 100, 2, 2, 30, 4, 5, 6, 7, 7 };
		List<Integer> al = Arrays.asList(ArrayUtils.toObject(arr));
		ArrayList<Integer> al2 = new ArrayList<>(al);
		System.out.println("Arraylist : " + al2);
		// HashSet<Integer> hs = new HashSet<>(al2);

		// al2.addAll(hs);
		System.out.println("Arraylist : " + al2);
		LinkedHashSet<Integer> lst = new LinkedHashSet<>(al2);
		Collections.emptyList();
		al2.clear();
		System.out.println("Arraylist after clear : " + al2);
		System.out.println("LinkedHashSet : " + lst);
		Set<Integer> st = new TreeSet<>(lst);
		System.out.println("Set : " + st);

		TreeSet<Integer> tr = new TreeSet<>(new arrDesce());
		for (Integer in : st) {
			tr.add(in);
		}
		System.out.println("Treeset: " + tr);

	}
}
