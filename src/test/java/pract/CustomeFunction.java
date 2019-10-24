package pract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class CustomeFunction {
	public static String one;

	public void findItNumOfDupliChar(String str) {

		HashMap<Character, Integer> hs = new HashMap<>();
		char[] ch = str.toCharArray();

		for (Character ch1 : ch) {
			if (hs.containsKey(ch1)) {
				System.out.println("If code : " + ch1 + " : " + (hs.get(ch1) + 1));
				hs.put(ch1, hs.get(ch1) + 1);
			} else {
				System.out.println("Else code : " + ch1 + " : " + ch1);
				hs.put(ch1, 1);
			}
		}
		for (Map.Entry<Character, Integer> ent : hs.entrySet()) {
			System.out.println("KeyVal : " + ent.getKey() + " Value :" + ent.getValue());
		}
		Set<Character> st = hs.keySet();
		for (Character ch3 : st) {
			if (hs.get(ch3) > 1) {

			}
		}
	}

	public void findItNumOfDupliCharWord(String str) {
		StringTokenizer str3 = new StringTokenizer(str, " ");
		ArrayList<String> arr = new ArrayList<>();
		while (str3.hasMoreTokens()) {
			arr.add(str3.nextToken());

		}
		System.out.println("Array : " + arr);
		HashMap<String, Integer> ht = new HashMap<>();
		int i = 0;
		for (String s : arr) {
			if (ht.containsKey(s)) {
				// System.out.println("If code : " + s + " : " + (ht.get(s) + 1));
				ht.put(s, ht.get(s) + 1);
			} else {
				// System.out.println("Else code : " + s + " : " + (ht.get(s)));
				ht.put(s, 1);

			}
			i++;
		}

		Set<String> st = ht.keySet();
		for (String ss : st) {
			if (ht.get(ss) > 1) {
				System.out.println(ss + " : " + ht.get(ss));

			}

		}

	}

}
