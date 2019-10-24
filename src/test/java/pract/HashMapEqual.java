package pract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapEqual {
	public static void main(String arg[]) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		HashMap<Integer, String> map2 = new HashMap<>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		HashMap<Integer, String> map3 = new HashMap<>();

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "C");
		// Compare hashmap for same key-values – HashMap.equals()
		System.out.println(map1.equals(map2));// true
		System.out.println(map1.equals(map3)); // false
		// Compare two hashmaps for same keys – HashMap.keySet()
		System.out.println(map1.keySet().equals(map2.keySet())); // true
		System.out.println(map1.keySet().equals(map3.keySet()));// false

		// Find out extra keys

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "C");

		HashSet<Integer> unionKeys = new HashSet<>(map1.keySet());
		unionKeys.addAll(map3.keySet());
		unionKeys.removeAll(map1.keySet());
		System.out.println(unionKeys);
		// Duplicates are NOT allowed
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));
		// Duplicates are allowed
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
	}

}
